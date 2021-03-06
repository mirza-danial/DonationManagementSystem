package Model;

import java.util.ArrayList;
import java.util.List;

public class Project extends Entity {
    private List<Volunteer> volunteersInProject;
    private List<Donation> donationsForProject;

    Project(int id, String name) {
        super(id+200, name);
        volunteersInProject = new ArrayList<>();
        donationsForProject = new ArrayList<>();
    }
    
    public List<Donation> getDonations() {
        return donationsForProject;
    }
    public void removeDonation(Donation d)
    {
        for(Donation i : donationsForProject)
        {
            if(i.equals(d))
            {
                donationsForProject.remove(d);
            }
        }
    }
    public List<Volunteer> getVolunteers() {
        return volunteersInProject;
    }

    public boolean addVolunteer(Volunteer v) throws Exception{
        if(v.getAssignedProj() != null)
            throw new Exception("Volunteer already assigned to Project: " + v.getAssignedProj());
        v.setAssignedProj(this);
        return volunteersInProject.add(v);
    }
    public boolean addDonation(Donation d){
        d.setAssociatedProject(this);
        return donationsForProject.add(d);
    }
    
    public String toString(){
        String x = super.toString();
        x += "\nVolunteers associated:\n" + volunteersInProject;
        x += "\nDonations allocated:\n" + donationsForProject;
        return x;
    }
}
