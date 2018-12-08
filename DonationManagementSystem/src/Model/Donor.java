package Model;

import java.util.ArrayList;
import java.util.List;

public class Donor extends Entity{
    List<Donation> donations;

    public List<Donation> getDonations() {
        return donations;
    }
    
    Donor(int id, String name) {
        super(id+300, name);
        donations = new ArrayList<>();
    }
    
    public void addDonation(Donation d){
        d.setSourceDonor(this);
        donations.add(d);
    }
}
