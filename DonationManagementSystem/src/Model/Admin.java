package Model;

import java.util.List;
import java.util.Objects;

public class Admin extends Entity {
    private String userName;
    private String password;
    private Organization org;    

    Admin(int id, String userName, String fullName, String pwd) {
        super(id, fullName);
        this.userName = userName;
        password = pwd;
    }

    public void addDonationToProject(Donation donation, int projID){
        org.addDonation(donation);
        Project pr = org.getProject(projID);
        pr.addDonation(donation);
    }
    public boolean addDonationToOrg(Donation d, Donor donor){
        return org.addDonation(d);
    }
    
    public Project createNewProject(){
        return org.createNewProject();
    }
    public Donor createNewDonor(){
        return org.createNewDonor();
    }
    public Donation createNewDonation(){
        return org.createNewDonation();
    }
    public Volunteer createNewVolunteer(){
        return org.createNewVolunteer();
    }
    
    public boolean addVolunteer(Volunteer v){
        return org.addVolunteer(v);
    }
    public boolean addProject(Project p){
        return org.addProject(p);
    }
    public boolean addDonor(Donor d){
        return org.addDonor(d);
    }
    
    public boolean removeVolunteer(Volunteer v){
        return org.removeVolunteer(v);
    }
    public boolean removeProject(Project p){
        return org.removeProject(p);
    }
    public boolean removeDonor(Donor d){
        return org.removeDonor(d);
    }

    public boolean updateVolunteer(Volunteer v){
        return org.updateVolunteer(v);
    }
    public boolean updateProject(Project p){
        return org.updateProject(p);
    }
    public boolean updateDonor(Donor d){
        return org.updateDonor(d);
    }
    public boolean updateDonation(Donation d){
        return org.updateDonation(d);
    }
    
    public Project getProject(int id){
        return org.getProject(id);
    }
    public Donor getDonor(int id){
        return org.getDonor(id);
    }
    public Volunteer getVolunteer(int id){
        return org.getVolunteer(id);
    }
    public Donation getDonation(int id){
        return org.getDonation(id);
    }
    
    public List<Project> getAllProjects() {
        return org.getAllProjects();
    }
    public List<Donor> getAllDonors() {
        return org.getAllDonors();
    }
    public List<Volunteer> getAllVolunteers() {
        return org.getAllVolunteers();
    }
    public List<Donation> getAllDonations() {
        return org.getAllDonations();
    }
    
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public Organization getOrg() {
        return org;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setOrg(Organization org) {
        this.org = org;
    }
    
    public double getTotalFunds(){
        return org.totalFunds();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }
}
