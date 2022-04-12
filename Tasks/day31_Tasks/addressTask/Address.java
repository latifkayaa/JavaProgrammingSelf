package day31_Tasks.addressTask;

public class Address {
    public String city, state, zipCode, buildingNumber, street;

    public Address(String city, String state, String zipCode, String buildingNumber, String street) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
        this.street = street;
    }


    public String toString() {
        return "Address{" +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\''+
                "city='" + city +'\''  +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode +'\''+
                '}';
    }
}
