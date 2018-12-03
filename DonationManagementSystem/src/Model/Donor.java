package Model;

import java.util.ArrayList;
import java.util.List;

public class Donor extends Entity{
    List<Donation> donations;
    
    Donor(int id, String name) {
        super(id+300, name);
        donations = new ArrayList<>();
    }
}
