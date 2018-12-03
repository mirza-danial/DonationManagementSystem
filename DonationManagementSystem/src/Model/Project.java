package Model;

import java.util.ArrayList;
import java.util.List;

public class Project extends Entity {
    private List<Volunteer> volunteers;
    private List<Donation> donations;

    Project(int id, String name) {
        super(id+200, name);
        volunteers = new ArrayList<>();
        donations = new ArrayList<>();
    }
    
    public List<Donation> getDonations() {
        return donations;
    }
    public List<Volunteer> getVolunteers() {
        return volunteers;
    }

    public boolean addVolunteer(Volunteer v){
        return volunteers.add(v);
    }
    public boolean addDonation(Donation d){
        return donations.add(d);
    }
    
    public String toString(){
        String x = super.toString();
        x += "\nVolunteers associated:\n" + volunteers;
        x += "\nDonations allocated:\n" + donations;
        return x;
    }
}
