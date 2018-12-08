package Model;

public class PropertyInfo {
    String type;
    int quantity;

    PropertyInfo() {
    }
    
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
