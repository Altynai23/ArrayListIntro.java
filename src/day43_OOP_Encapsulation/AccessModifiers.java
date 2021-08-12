package day43_OOP_Encapsulation;

public class AccessModifiers {

    public static int publicVariable = 100;
    static int defaultVariable = 200;  // access modifier: default
    private static int privateVariable =  300;


    //  protected static int protectedVariable = 1000;

    public static void main(String[] args) {
        System.out.println(privateVariable); //private access modifier is reachable within same class
        System.out.println(defaultVariable); //default access modifier is reachable within same class
        System.out.println(publicVariable);// public access modifier is reachable within same class

    }


}
