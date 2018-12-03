package Model;

public class Volunteer extends Entity {
    private Project assignedProj;

    public Project getAssignedProj() {
        return assignedProj;
    }

    public void setAssignedProj(Project assignedProj) {
        this.assignedProj = assignedProj;
    }

    Volunteer(int id, String name) {
        super(id+100, name);
    }
}
