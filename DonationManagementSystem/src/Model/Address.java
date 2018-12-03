package Model;

public class Address {

    private String addrLine;
    private String city;
    private String country;
    
    public String toString(){
        String x = addrLine + ", " + city + ", " + country;
        return x;
    }

    public String getAddrLine() {
        return addrLine;
    }

    public void setAddrLine(String addrLine) {
        this.addrLine = addrLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(String addrLine, String city, String country) {
        this.addrLine = addrLine;
        this.city = city;
        this.country = country;
    }
}
