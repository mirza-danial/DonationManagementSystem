package Model;

import java.util.Date;

public class Donation {
    private int id;
    
    private Donor sourceDonor;
    private Project associatedProject;
    
    private double value;
    public boolean isReceived;
    public PledgeInfo pledgeInfo;
    public PropertyInfo propertyInfo;

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

    public String toString(){
        String x = "Id: " + id + ", DonatedBy: " + sourceDonor.getName() + ", Value: " + value;
        return x;
    }
    
    public void setPledgeInfo(Date dueDt){
        if(pledgeInfo == null)
            pledgeInfo = new PledgeInfo(dueDt);
        else
            pledgeInfo.dueDate = dueDt;
    }
    public void setPropertyInfo(String type, int quant){
        if(propertyInfo == null)
            propertyInfo = new PropertyInfo(type, quant);
        else {
            propertyInfo.quantity = quant;
            propertyInfo.type = type;
        }
    }
    public void assignToProject(Project p){
        p.addDonation(this);
        associatedProject = p;
    }
    
    public boolean decrementQuant(){
        if(propertyInfo != null && propertyInfo.quantity > 0){
            propertyInfo.quantity--;
            if(propertyInfo.quantity == 0)
                return false;
            else
                return true;
        }
        return false;
    }

    private class PledgeInfo{
        private Date dueDate;

        public Date getDueDate() {
            return dueDate;
        }

        public PledgeInfo(Date dueDate) {
            this.dueDate = dueDate;
        }
    }

    private class PropertyInfo{
        private String type;
        private int quantity;

        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public PropertyInfo(String type, int quantity) {
            this.type = type;
            this.quantity = quantity;
        }
    }
}
