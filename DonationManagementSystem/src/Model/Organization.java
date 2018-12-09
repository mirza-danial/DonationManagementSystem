package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Organization extends Entity{
    
    private Date startDate;
    private boolean isActive;
    
    private List<Project> allProjects;
    private List<Admin> allAdmins;
    private List<Donor> allDonors;
    private List<Volunteer> allVolunteers;
    private List<Donation> allDonations;
    
    /*Haider Addition staticAdminCount to Assign IDs */
    private static int staticAdminCount = 0;
    
    public Organization(int id, String name, String descr) {
        super(id, name);
        super.setDescritpion(descr);
        startDate = new Date();
        isActive = true;
        
        allProjects = new ArrayList<>();
        allAdmins = new ArrayList<>();
        allDonors = new ArrayList<>();
        allVolunteers = new ArrayList<>();
        allDonations = new ArrayList<>();
    }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public boolean isIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public String toString(){
        String x = "---Organization details---\nTitle: " + name;
        x += "\nDescritpion: " + description;
        x += "\nProjects: " + allProjects.size();
        x += "\nDonors: " + allDonors.size();
        x += "\nVolunteers: " + allVolunteers.size();
        x += "\nDonations: " + totalFunds();
        
        return x + "\n";
    }
    
    public boolean addAdmin(String fullName, String userName, String password){
        /*Raphael's Code*/
        //********************************//
        //int id = allAdmins.size() + 1; 
        //********************************//
        
        /*Changes introduced by Haider*/
        //********************************//
        //int id = staticAdminCount + 1;
        //staticAdminCount++;
        //********************************//
        
        /*Changes introduced by Danial*/
        //********************************//
        int maxID = -1;
        for(Admin a: allAdmins)
        {
            if(a.getId() > maxID)
            {
                maxID = a.getId();
            }
        }
        int id = maxID + 1; 
        //********************************//
        
        Admin newAdmin = new Admin(id, userName, fullName, password);
        return allAdmins.add(newAdmin);
    }
    public boolean removeAdmin(String userName, String pwd){
        for(Admin a: allAdmins){
            if(pwd.equals(a.getPassword()) && a.getUserName().equals(userName))
                return allAdmins.remove(a);
        }
        return false;
    }
    
    public Admin createNewAdmin(){
        //int id = allAdmins.size() + 1;
        /*Changes introduced by Danial*/
        //********************************//
        int maxID = -1;
        for(Admin a: allAdmins)
        {
            if(a.getId() > maxID)
            {
                maxID = a.getId();
            }
        }
        int id = maxID + 1; 
        //********************************//
        
        Admin a = new Admin(id, null, null, null);
        a.setOrg(this);
        allAdmins.add(a);
        return a;
    }
    Project createNewProject() {
        int id = allProjects.size() + 1;
        Project p = new Project(id, null);
        allProjects.add(p);
        return p;
    }
    Donor createNewDonor() {
        int id = allDonors.size() + 1;
        Donor d= new Donor(id, null);
        allDonors.add(d);
        return d;
    }
    Donation createNewDonation() {
        int id = allDonations.size() + 1;
        Donation d = new Donation(id);
        //allDonations.add(d);
        return d;
    }
    Volunteer createNewVolunteer() {
        int id = allVolunteers.size() + 1;
        Volunteer v = new Volunteer(id, null);
        allVolunteers.add(v);
        return v;
    }
    
    boolean addVolunteer(Volunteer v) {
        return addEntityToList(allVolunteers, v);
    }
    boolean addProject(Project p) {
        return addEntityToList(allProjects, p);
    }
    boolean addDonor(Donor d) {
        return addEntityToList(allDonors, d);
    }
    boolean addDonation(Donation d) {
        return allDonations.add(d);
    }
    
    boolean removeVolunteer(Volunteer v) {
        return allVolunteers.remove(v);
    }
    boolean removeProject(Project p) {
        return allProjects.remove(p);
    }
    boolean removeDonor(Donor d) {
        return allDonors.remove(d);
    }

    boolean updateVolunteer(Volunteer v) {
        return updateInList(allVolunteers, v);
    }
    boolean updateProject(Project p) {
        return updateInList(allProjects, p);
    }
    boolean updateDonor(Donor d) {
        return updateInList(allDonors, d);
    }
    boolean updateDonation(Donation d){
        return updateInList(allDonations, d);
    }
    
    public Admin getAdmin(String userName, String password){
        for(Admin a: allAdmins){
            if(a.getUserName().equals(userName) && a.getPassword().equals(password))
                return a;
        }
        return null;
    }
    public Donor getDonor(int id){
        return (Donor)getEntity(allDonors, id);
    }
    public Volunteer getVolunteer(int id){
        return (Volunteer) getEntity(allVolunteers, id);
    }
    public Project getProject(int id){
        return (Project) getEntity(allProjects, id);
    }
    public Donation getDonation(int id){
        for(Donation e: allDonations){
            Donation x = e;
            if(x.getId() == id)
                return x;
        }
        return null;
    }
    
    List<Project> getAllProjects() {
        return allProjects;
    }
    List<Donor> getAllDonors() {
        return allDonors;
    }
    List<Volunteer> getAllVolunteers() {
        return allVolunteers;
    }
    List<Donation> getAllDonations() {
        return allDonations;
    }
    
    private <T> Object getEntity(List<T> list, int id){
        for(T e: list){
            Entity x = (Entity) e;
            if(x.getId() == id)
                return x;
        }
        return null;
    }
    private boolean addEntityToList(List list, Entity e){
        int id = list.size() + 1;
        return list.add(e);
    }
    private <E> boolean updateInList(List<E> list, E entity){
        int ind = list.indexOf(entity);
        if(ind >= 0)
            list.set(ind, entity);
        else
            return false;
        return true;
    }
    
    double totalFunds(){
        double sum = 0;
        for(Donation d: allDonations){
            sum += d.getValue();
        }
        return sum;
    }
            
    public List<Admin> getAllAdmins()
    {
        return allAdmins;
    }
}
