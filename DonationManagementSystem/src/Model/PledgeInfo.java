package Model;

import java.util.Date;

public class PledgeInfo {

    private Date dueDate;

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    PledgeInfo(){}
    
    public Date getDueDate() {
        return dueDate;
    }

    public PledgeInfo(Date dueDate) {
        this.dueDate = dueDate;
    }
}