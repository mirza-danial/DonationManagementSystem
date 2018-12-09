package Model;

import java.util.Date;

public class Donation  {

    private int id;
    private Donor sourceDonor;
    private Project associatedProject;
    private double value;
    
    public PledgeInfo pledgeInfo;
    public PropertyInfo propertyInfo;

    void setId(int id){ this.id = id;}

    public void setAssociatedProject(Project associatedProject) {
        this.associatedProject = associatedProject;
    }
    public void setSourceDonor(Donor sourceDonor) {
        this.sourceDonor = sourceDonor;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public Project getAssociatedProject() {
        return associatedProject;
    }
    public double getValue() {
        return value;
    }
    public int getId() {
        return id;
    }
    public Donor getSourceDonor() {
        return sourceDonor;
    }

    Donation(int id) {
        this.id = 400 + id;
    }

    public String toString() {
        String x = "Id: " + id + ", DonatedBy: " + sourceDonor.getName() + ", Value: " + value;
        return x;
    }

    public void setPledgeInfo(Date dueDt) {
        if (pledgeInfo == null) {
            pledgeInfo = new PledgeInfo(dueDt);
        } else {
            pledgeInfo.setDueDate(dueDt);
        }
    }

    public void setPropertyInfo(String type, int quant) {
        if (propertyInfo == null) {
            propertyInfo = new PropertyInfo(type, quant);
        } else {
            propertyInfo.setQuantity(quant);
            propertyInfo.setType(type);
        }
    }

    public void assignToProject(Project p) {
        p.addDonation(this);
        associatedProject = p;
    }

    public void removeProject() {
        associatedProject.removeDonation(this);
        associatedProject = null;
    }

    public boolean decrementQuant() {
        if (propertyInfo != null && propertyInfo.quantity > 0) {
            propertyInfo.quantity--;
            if (propertyInfo.quantity == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
