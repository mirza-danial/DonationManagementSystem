package Model;

import java.util.*;
import java.util.Objects;

abstract class Entity {
    protected int id;
    protected String name;
    protected String description;
    protected Address addr;
    protected List<String> phoneNumbers;
    
    public String toString(){
        String x = "ID: " + id + ", Name: " + name;
//        x += "\nDescription: " + descritpion;
//        x += "\nAddress: " + addr;
//        x += "\nPhone Numbers: " + phoneNumbers;
        return x + "\n";
    }
    
    Entity()
    {
        phoneNumbers = new ArrayList();
    }
    
    public Entity(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
        
    void setId(int id){this.id = id;}
    public void setName(String name) {
        this.name = name;
    }
    public void setDescritpion(String descritpion) {
        this.description = descritpion;
    }
    public void setAddr(String firstLine, String city, String country) {
        addr = new Address(firstLine, city, country);
    }
    void setPhoneNumbers(List<String> phonesList){phoneNumbers = phonesList;}
    public boolean addPhoneNum(String number){
        return phoneNumbers.add(number);
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescritpion() {
        return description;
    }
    public Address getAddr() {
        return addr;
    }
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }
    @Override
    public int hashCode() {
        return id;
    }
}