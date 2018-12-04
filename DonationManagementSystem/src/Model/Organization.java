package Model;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    List<Project> allProjects;
    List<Admin> allAdmins;
    List<Donor> allDonors;
    List<Volunteer> allVolunteers;
    List<Donation> allDonations;

    public String title;
    public String description;
    public Organization(String title, String descr) {
        this.title = title;
        description = descr;

        allProjects = new ArrayList<>();
        allAdmins = new ArrayList<>();
        allDonors = new ArrayList<>();
        allVolunteers = new ArrayList<>();
        allDonations = new ArrayList<>();
    }

    public String toString(){
        String x = "---Organization details---\nTitle: " + title;
        x += "\nDescritpion: " + description;
        x += "\nProjects: " + allProjects.size();
        x += "\nDonors: " + allDonors.size();
        x += "\nVolunteers: " + allVolunteers.size();
        x += "\nDonations: " + totalFunds();
        
        return x + "\n";
    }
    
    public Admin createNewAdmin(){
        int id = allAdmins.size() + 1;
        Admin a = new Admin(id, null, null, null);
        allAdmins.add(a);
        return a;
    }
    public boolean addAdmin(String fullName, String userName, String password){
        int id = allAdmins.size() + 1;
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
        allDonations.add(d);
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
        return removeFromList(allVolunteers, v);
    }
    boolean updateProject(Project p) {
        return removeFromList(allProjects, p);
    }
    boolean updateDonor(Donor d) {
        return removeFromList(allDonors, d);
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
    private <E> boolean removeFromList(List<E> list, E entity){
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
    
    public Donation getDonation(int id)
    {
        for(Donation d: allDonations)
        {
            if(d.getId() == id)
            {
                return d;
            }
        }
        return null;
    }
    public void setTitle(String name)
    {
        this.title = title;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
            
    public List<Admin> getAllAdmins()
    {
        return allAdmins;
    }
}
