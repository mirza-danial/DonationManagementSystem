package Model;

public class Volunteer extends Entity {
    private Project assignedProj;

    public Project getAssignedProj() {
        return assignedProj;
    }

    public void setAssignedProj(Project p) {
        this.assignedProj = p;
    }

    Volunteer(int id, String name) {
        super(id+100, name);
    }
}
