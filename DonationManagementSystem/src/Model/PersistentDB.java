package Model;

import Model.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Raphael
 */
public class PersistentDB {

    Organization org;
    Admin admin;
    Connection conn;

    public void saveAllOrgsToDB(List<Organization> orgs) throws Exception {
        if (conn != null) {
            for (Organization o : orgs) {
                this.org = o;
                saveOrgToDB();
            }
        } else {
            throw new Exception("Connection not initialized");
        }
    }

    public void loadAllOrgsFromDB(List<Organization> allOrgs) throws Exception {
        if (conn != null) {
            if (allOrgs == null) {
                allOrgs = new ArrayList<>();
            }

            //Attributes of Org
            Organization o;
            int id;
            Date stDate = null;
            Boolean isAct = null;
            String name = null, descr = null, addrLine = null, city = null, country = null;
            List<String> phonesList = new ArrayList<>();

            String sql = "SELECT * FROM Organization";
            Statement select = conn.createStatement();
            ResultSet rSet = select.executeQuery(sql);
            while (rSet.next()) {
                List args = getEntityAttributesList(rSet);  //id, name, descr, addr..., phonesList
                id = (int) args.get(0);
                name = (String) args.get(1);
                descr = (String) args.get(2);
                addrLine = (String) args.get(3);
                city = (String) args.get(4);
                country = (String) args.get(5);
                phonesList = (List<String>) args.get(6);

                stDate = rSet.getDate("StartDate");
                isAct = rSet.getBoolean("IsActive");

                o = new Organization(id, name, descr);
                o.setPhoneNumbers(phonesList);
                o.setAddr(addrLine, city, country);
                o.setIsActive(isAct);
                o.setStartDate(stDate);
                allOrgs.add(o);
            }
        } else {
            throw new Exception("Connection not initialized");
        }
    }

    public void loadFromDB() throws Exception {
        if (conn != null && org != null) {
            loadAllAdmins();
            this.admin = org.getAllAdmins().get(0); //Use any Admin for following operations

            loadAllDonors();
            loadAllProjects();
            loadAllDonations();
            loadAllVolunteers();
        } else if (conn == null) {
            throw new Exception("Connection not initialized.");
        } else if (org == null) {
            throw new Exception("Org not initialized");
        }
    }

    public boolean saveToDB() throws SQLException, Exception {
        if (org != null && conn != null && admin != null) {
            //Order of tables important
            saveOrgToDB();
            saveAllAdminsToDB();
            saveAllProjectsToDB();
            saveAllDonorsToDB();
            saveAllDonationsToDB();
            saveAllVolunteersToDB();
            return true;
        } else {
            if (conn == null) {
                throw new Exception("Connection variable not initialized in DB object");
            } else if (org == null) {
                throw new Exception("Org variable not initialized in DB object");
            } else {
                throw new Exception("Admin not initialized in DB object");
            }
        }
    }

    public void connect() throws SQLException {
        if (conn == null) {
            String url = "jdbc:derby://localhost:1527/dms";
            conn = DriverManager.getConnection(url, "ooad", "123");
        }
    }

    public void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public void setOrganizationAndAdmin(Organization org, Admin admin) {
        this.org = org;
        this.admin = admin;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private String getAddressString(Address a) {
        String address = null;
        if (a != null) {
            address = a.getAddrLine();
            address += ", " + a.getCity();
            address += ", " + a.getCountry();
        }
        return address;
    }

    private String getAllPhonesString(List<String> phonesList) {
        String allPhonesString = null;
        int size = phonesList.size();
        if (size > 0) {
            allPhonesString = "";
        }
        for (int i = 0; i < size; i++) {
            allPhonesString += phonesList.get(i);
            if (i < size - 1) {
                allPhonesString += ", ";
            }
        }
        return allPhonesString;
    }

    private String getInsertSql(String tableName, Integer[] intAttributes, Double[] dbAttr, Date[] dtAttr, Boolean[] blAttr, String... strAttr) {
        //Order of values is important
        int id = intAttributes[0];
        String sql = "INSERT INTO " + tableName + " VALUES (" + id;

        for (int i = 1; i < intAttributes.length; i++) {
            if (intAttributes[i] != null) {
                sql += ", " + intAttributes[i];
            } else {
                sql += ", NULL";
            }
        }

        if (dbAttr != null) {
            for (Double d : dbAttr) {
                if (d != null) {
                    sql += ", " + d;
                } else {
                    sql += ", NULL";
                }
            }
        }

        if (dtAttr != null) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            for (Date d : dtAttr) {
                if (d != null) {
                    sql += ", '" + df.format(d) + "'";
                } else {
                    sql += ", NULL";
                }
            }
        }

        if (blAttr != null) {
            for (Boolean b : blAttr) {
                if (b != null) {
                    sql += ", " + b;
                } else {
                    sql += ", NULL";
                }
            }
        }

        if (strAttr != null) {
            for (String s : strAttr) {
                if (s != null) {
                    sql += ", '" + s + "'";
                } else {
                    sql += ", NULL";
                }
            }
        }

        return sql + ")";
    }

    private String getUpdateSql(String tableName, String[] colNames, Integer[] intAttributes, Double[] dbAttr, Date[] dtAttr, Boolean[] blAttr, String... strAttr) {
        //Order of values is important
        int id = intAttributes[0];
        StringBuffer sql = new StringBuffer("UPDATE " + tableName + " SET ");
        int col = 1;

        for (int i = 1; i < intAttributes.length; i++, col++) {
            if (intAttributes[i] != null) {
                sql.append(colNames[col] + " = " + intAttributes[i] + ", ");
            } else {
                sql.append(colNames[col] + " = NULL, ");
            }
        }

        if (dbAttr != null) {
            for (Double d : dbAttr) {
                if (d != null) {
                    sql.append(colNames[col] + " = " + d + ", ");
                } else {
                    sql.append(colNames[col] + " = NULL, ");
                }
                col++;
            }
        }

        if (dtAttr != null) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            for (Date d : dtAttr) {
                if (d != null) {
                    sql.append(colNames[col] + " = '" + df.format(d) + "', ");
                } else {
                    sql.append(colNames[col] + " = NULL, ");
                }
                col++;
            }
        }

        if (blAttr != null) {
            for (Boolean b : blAttr) {
                if (b != null) {
                    sql.append(colNames[col] + " = " + b + ", ");
                } else {
                    sql.append(colNames[col] + " = NULL, ");
                }
                col++;
            }
        }

        if (strAttr != null) {
            for (String s : strAttr) {
                if (s != null) {
                    sql.append(colNames[col] + " = '" + s + "', ");
                } else {
                    sql.append(colNames[col] + " = NULL, ");
                }
                col++;
            }
        }

        int ind = sql.lastIndexOf(",");
        sql.replace(ind, ind + 1, " WHERE " + colNames[0] + " = " + id);

        return sql.toString();
    }

    private void saveObjectToDB(String tableName, String[] colNames, Integer[] intAttributes, Double[] dAttr, Date[] dtAttr, Boolean[] blAttr, String... strAttr) throws SQLException, Exception {
        ResultSet rSet = null;
        Statement findStmt = null, insertStmt = null, updateStmt = null;
        int id = intAttributes[0];

        String findSql = "SELECT COUNT(*) FROM " + tableName + " WHERE " + colNames[0] + " = " + id;
        try {
            findStmt = conn.createStatement();
            rSet = findStmt.executeQuery(findSql);
            rSet.next();
            int entryCount = rSet.getInt(1);
            if (entryCount == 0) {    //Insert object
                String insertSql = getInsertSql(tableName, intAttributes, dAttr, dtAttr, blAttr, strAttr);
                insertStmt = conn.createStatement();
                insertStmt.executeUpdate(insertSql);
            } else if (entryCount == 1) {
                String updateSql = getUpdateSql(tableName, colNames, intAttributes, dAttr, dtAttr, blAttr, strAttr);
                updateStmt = conn.createStatement();
                updateStmt.executeUpdate(updateSql);
            } else {
                throw new Exception("Multiple entries for ID = " + id);
            }

        } catch (SQLException s) {
            throw s;
        } catch (Exception e) {
            throw e;
        } finally {
            if (insertStmt != null) {
                insertStmt.close();
            }
            if (updateStmt != null) {
                updateStmt.close();
            }
            if (findStmt != null) {
                findStmt.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
    }

    private void saveOrgToDB() throws Exception, SQLException {
        //Attributes of Organization
        int id = org.getId();
        String name = org.getName();
        String descr = org.getDescritpion();
        Date stDate = org.getStartDate();
        DateFormat dF = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = dF.format(stDate);
        boolean isActive = org.isActive();
        String address = null, allPhonesString = null;
        address = getAddressString(org.getAddr());
        allPhonesString = getAllPhonesString(org.getPhoneNumbers());

        String[] colNames = {"id", "startDate", "isActive", "name", "description", "phone_numbers", "address"};
        saveObjectToDB("Organization", colNames, new Integer[]{id}, null, new Date[]{stDate}, new Boolean[]{isActive}, name, descr, allPhonesString, address);
    }

    private void saveAllAdminsToDB() throws SQLException, Exception {
        List<Admin> admins = org.getAllAdmins();

        //Attributes of Admins
        int id, orgId;
        String name, description, allPhonesString, address, userName, password;
        String[] colNames = {"id", "orgId", "name", "description", "phone_numbers", "address", "userName", "password"};
        for (Admin a : admins) {
            //Set the attributes
            id = a.getId();
            name = a.getName();
            description = a.getDescritpion();
            allPhonesString = getAllPhonesString(a.getPhoneNumbers());
            address = getAddressString(a.getAddr());
            userName = a.getUserName();
            password = a.getPassword();
            orgId = a.getOrg().getId();

            saveObjectToDB("ADMIN", colNames, new Integer[]{id, orgId}, null, null, null, name, description, allPhonesString, address, userName, password);
        }
    }

    private void saveAllDonationsToDB() throws SQLException, Exception {
        List<Donation> allDonations = admin.getAllDonations();
        //Attributes of Donation
        Integer id, orgId = org.getId(), donorId = null, projId = null;
        double value;
        boolean isPledge, isProperty;
        String type = null;    //DB Table field
        String[] colNames = {"id", "orgId", "donor_id", "proj_id", "value", "type"};
        for (Donation d : allDonations) {
            //Set the attributes
            id = d.getId();
            Donor don = d.getSourceDonor();
            if (don != null) {
                donorId = don.getId();
            }
            Project p = d.getAssociatedProject();
            if (p != null) {
                projId = p.getId();
            }
            value = d.getValue();
            isPledge = (d.pledgeInfo != null);
            isProperty = (d.propertyInfo != null);
            
            if(isProperty)
                type = "Property";
            else
                type = "Cash";
            if(isPledge)
                type += ", Pledged";

            saveObjectToDB("Donation", colNames, new Integer[]{id, orgId, donorId, projId}, new Double[]{value}, null, null, type);

            if (isPledge) {
                //Save PledgeInfo in Table
                colNames = new String[]{"d_id", "dueDate"};
                Date dueDate = d.pledgeInfo.getDueDate();
                saveObjectToDB("PledgeInfo", colNames, new Integer[]{id}, null, new Date[]{dueDate}, null);
            }
            if (isProperty) {
                //Save PropertyInfo in Table
                colNames = new String[]{"d_id", "quantity", "type"};
                //Attributes of PropertyInfo
                int quant = d.propertyInfo.getQuantity();
                String propType = d.propertyInfo.getType();
                saveObjectToDB("PropertyInfo", colNames, new Integer[]{id, quant}, null, null, null, propType);
            }
        }
    }

    private void saveAllProjectsToDB() throws SQLException, Exception {
        List<Project> allProjects = admin.getAllProjects();
        //Attributes of Project
        int id, orgId = org.getId();
        String name, descr, allPhonesString, address;

        String[] colNames = {"id", "orgId", "name", "description", "phone_numbers", "address"};
        for (Project d : allProjects) {
            id = d.getId();
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());

            saveObjectToDB("PROJECT", colNames, new Integer[]{id, orgId}, null, null, null, name, descr, allPhonesString, address);
        }
    }

    private void saveAllDonorsToDB() throws SQLException, Exception {
        List<Donor> allDonors = admin.getAllDonors();
        //Attributes of Donor
        int id, orgId = org.getId();
        String name, descr, allPhonesString, address;

        String[] colNames = {"id", "orgId", "name", "description", "phone_numbers", "address"};
        for (Donor d : allDonors) {
            //Set the attributes
            id = d.getId();
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());

            saveObjectToDB("DONOR", colNames, new Integer[]{id, orgId}, null, null, null, name, descr, allPhonesString, address);
        }
    }

    private void saveAllVolunteersToDB() throws SQLException, Exception {
        List<Volunteer> allVolunteers = admin.getAllVolunteers();

        //Attributes of Volunteer
        Integer id, orgId = org.getId(), projId = null;
        String name, descr, allPhonesString, address;
        String[] colNames = {"id", "orgId", "proj_id", "name", "description", "phone_numbers", "address"};

        for (Volunteer d : allVolunteers) {
            //Set the attributes
            id = d.getId();
            Project p = d.getAssignedProj();
            if (p != null) {
                projId = p.getId();
            }
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());

            saveObjectToDB("Volunteer", colNames, new Integer[]{id, orgId, projId}, null, null, null, name, descr, allPhonesString, address);
        }
    }

    //List= id, name, descr, addrLine, city, country, phonesList
    private List getEntityAttributesList(ResultSet rSet) throws SQLException {
        Integer id = rSet.getInt("Id");
        String name = rSet.getString("name");
        String descr = rSet.getString("Description");
        String addrLine = null, city = null, country = null;
        List<String> phonesList = new ArrayList<>();

        String allPhonesString = rSet.getString("Phone_Numbers");
        if (allPhonesString != null) {
            String[] phones = allPhonesString.split(",");
            for (String p : phones) {
                phonesList.add(p.trim());
            }
        }

        String address = rSet.getString("Address");
        if (address != null) {
            String[] addrParts = address.split(",");
            addrLine = addrParts[0].trim();
            if (addrParts.length >= 2) {
                city = addrParts[1].trim();
            }
            if (addrParts.length == 3) {
                country = addrParts[2].trim();
            }
        }

        return Arrays.asList(id, name, descr, addrLine, city, country, phonesList);
    }

    private void loadAllAdmins() throws SQLException {
        //Attributes
        Admin a;
        int id, orgId;
        String name, descr, addrLine, city, country, userName, pwd;
        List<String> phonesList;

        String sql = "SELECT * FROM Admin where orgId = " + org.getId();
        Statement select = conn.createStatement();
        ResultSet rSet = select.executeQuery(sql);

        while (rSet.next()) {
            //Set the attributes
            List args = getEntityAttributesList(rSet);
            id = (int) args.get(0);
            name = (String) args.get(1);
            descr = (String) args.get(2);
            addrLine = (String) args.get(3);
            city = (String) args.get(4);
            country = (String) args.get(5);
            phonesList = (List<String>) args.get(6);
            orgId = rSet.getInt("OrgId");
            userName = rSet.getString("userName");
            pwd = rSet.getString("Password");

            a = org.createNewAdmin();
            a.setId(id);
            a.setName(name);
            a.setDescritpion(descr);
            a.setAddr(addrLine, city, country);
            a.setPhoneNumbers(phonesList);
            a.setUserName(userName);
            a.setPassword(pwd);
            org.addAdmin(a);
        }
    }

    private void loadAllDonors() throws SQLException {
        //Attributes
        Donor d;
        int id, orgId;
        String name, descr, addrLine, city, country;
        List<String> phonesList;

        String sql = "SELECT * FROM Donor where orgId = " + org.getId();
        Statement select = conn.createStatement();
        ResultSet rSet = select.executeQuery(sql);

        while (rSet.next()) {
            //Set the attributes
            List args = getEntityAttributesList(rSet);
            id = (int) args.get(0);
            name = (String) args.get(1);
            descr = (String) args.get(2);
            addrLine = (String) args.get(3);
            city = (String) args.get(4);
            country = (String) args.get(5);
            phonesList = (List<String>) args.get(6);
            orgId = rSet.getInt("OrgId");

            d = org.createNewDonor();
            d.setId(id);
            d.setName(name);
            d.setDescritpion(descr);
            d.setAddr(addrLine, city, country);
            d.setPhoneNumbers(phonesList);
            admin.addDonor(d);
        }
    }

    private void loadAllProjects() throws SQLException {
        //Attributes
        Project p;
        int id, orgId;
        String name, descr, addrLine, city, country;
        List<String> phonesList;

        String sql = "SELECT * FROM Project where orgId = " + org.getId();
        Statement select = conn.createStatement();
        ResultSet rSet = select.executeQuery(sql);

        while (rSet.next()) {
            //Set the attributes
            List args = getEntityAttributesList(rSet);
            id = (int) args.get(0);
            name = (String) args.get(1);
            descr = (String) args.get(2);
            addrLine = (String) args.get(3);
            city = (String) args.get(4);
            country = (String) args.get(5);
            phonesList = (List<String>) args.get(6);
            orgId = rSet.getInt("OrgId");

            p = org.createNewProject();
            p.setId(id);
            p.setName(name);
            p.setDescritpion(descr);
            p.setAddr(addrLine, city, country);
            p.setPhoneNumbers(phonesList);
            admin.addProject(p);
        }
    }

    private void loadAllDonations() throws SQLException {
        //Attributes
        Donation d;
        Integer id, orgId, donorId, projId;
        double value;
//        String type;

        String sql = "SELECT * FROM Donation where orgId = " + org.getId();
        Statement select = conn.createStatement();
        ResultSet rSet = select.executeQuery(sql);

        while (rSet.next()) {
            //Set the attributes
            id = rSet.getInt("Id");
            orgId = rSet.getInt("OrgId");
            donorId = rSet.getInt("Donor_Id");
            projId = rSet.getInt("Proj_Id");
            value = rSet.getDouble("Value");
//            type = rSet.getString("Type");

            d = org.createNewDonation();
            d.setId(id);
            d.setValue(value);

            Donor don = admin.getDonor(donorId);
            if (projId != null) { //Update corressponding Project 
                admin.addDonationToProject(d, donorId, projId);
            }
            else
                admin.addDonationToOrg(d, don);
        }
    }

    private void loadAllVolunteers() throws SQLException, Exception {
        //Attributes
        Volunteer v;
        Integer id, orgId, projId;
        String name, descr, addrLine, city, country;
        List<String> phonesList;

        String sql = "SELECT * FROM Volunteer where orgId = " + org.getId();
        Statement select = conn.createStatement();
        ResultSet rSet = select.executeQuery(sql);

        while (rSet.next()) {
            //Set the attributes
            List args = getEntityAttributesList(rSet);
            id = (int) args.get(0);
            name = (String) args.get(1);
            descr = (String) args.get(2);
            addrLine = (String) args.get(3);
            city = (String) args.get(4);
            country = (String) args.get(5);
            phonesList = (List<String>) args.get(6);
            orgId = rSet.getInt("OrgId");
            projId = rSet.getInt("Proj_Id");

            v = org.createNewVolunteer();
            v.setId(id);
            v.setName(name);
            v.setDescritpion(descr);
            v.setAddr(addrLine, city, country);
            v.setPhoneNumbers(phonesList);
            admin.addVolunteer(v);
            
            if(projId != null){ //Update corresponding project
                Project p = admin.getProject(projId);
                p.addVolunteer(v);
                
            }
        }
    }
}
