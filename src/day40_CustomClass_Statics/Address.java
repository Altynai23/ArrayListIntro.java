package day40_CustomClass_Statics;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public static String country = "USA";

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }

    /*
    public void setInfo(){
        System.out.println(country);
        System.out.println(buildingNumber);// instance method accepts static & non-static (object can share class members)
    }

    public static void setInfo2(){
        System.out.println(country);
        System.out.println(buildingNumber);// static only accept static members (class cannot share object' members)
    }
     */

    public String toString(){
        return buildingNumber+" "+street+"/n"+city+" "+state+", "+zipCode;
    }


}
