package Database;

import Model.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Raphael
 */
public class PersistentDB {

    Organization org;
    Admin admin;
    Connection conn;

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
        boolean isActive = org.isIsActive();
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
        Integer id, donorId = null, projId = null;
        double value;
        boolean isPledge, isProperty;

        String[] colNames = {"id", "donor_id", "project_id", "value", "isPledge", "isProperty"};
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

            saveObjectToDB("Donation", colNames, new Integer[]{id, donorId, projId}, new Double[]{value}, null, new Boolean[]{isPledge, isProperty});
            
            if(isPledge){
                //Save PledgeInfo in Table
                colNames = new String[]{"d_id", "dueDate"};
                Date dueDate = d.pledgeInfo.getDueDate();
                saveObjectToDB("PledgeInfo", colNames, new Integer[]{id}, null, new Date[]{dueDate}, null);
            }
            if(isProperty){
                //Save PropertyInfo in Table
                colNames = new String[]{"d_id", "quantity", "type"};
                //Attributes of PropertyInfo
                int quant = d.propertyInfo.getQuantity();
                String type = d.propertyInfo.getType();
                saveObjectToDB("PropertyInfo", colNames, new Integer[]{id, quant}, null, null, null, type);
            }
        }
    }
    private void saveAllProjectsToDB() throws SQLException, Exception {
        List<Project> allProjects = admin.getAllProjects();
        //Attributes of Project
        int id;
        String name, descr, allPhonesString, address;
        
        String[] colNames = {"id", "name", "description", "phone_numbers", "address"};
        for(Project d: allProjects){
            id = d.getId();
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());
            
            saveObjectToDB("PROJECT", colNames, new Integer[]{id}, null, null, null, name, descr, allPhonesString, address);
        }
    }
    private void saveAllDonorsToDB() throws SQLException, Exception {
        List<Donor> allDonors = admin.getAllDonors();
        //Attributes of Donor
        int id;
        String name, descr, allPhonesString, address;
        
        String[] colNames = {"id", "name", "description", "phone_numbers", "address"};
        for(Donor d: allDonors){
            //Set the attributes
            id = d.getId();
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());
            
            saveObjectToDB("DONOR", colNames, new Integer[]{id}, null, null, null, name, descr, allPhonesString, address);
        }
    }
    private void saveAllVolunteersToDB() throws SQLException, Exception {
        List<Volunteer> allVolunteers = admin.getAllVolunteers();
        
        //Attributes of Volunteer
        Integer id, projId = null;
        String name, descr, allPhonesString, address;
        String[] colNames = {"id", "project_id", "name", "description", "phone_numbers", "address"};
        
        for(Volunteer d : allVolunteers){
            //Set the attributes
            id = d.getId();
            Project p = d.getAssignedProj();
            if(p != null)
                projId = p.getId();
            name = d.getName();
            descr = d.getDescritpion();
            allPhonesString = getAllPhonesString(d.getPhoneNumbers());
            address = getAddressString(d.getAddr());
            
            saveObjectToDB("Volunteer", colNames, new Integer[]{id, projId}, null, null, null, name, descr, allPhonesString, address);
        }
    }
}
