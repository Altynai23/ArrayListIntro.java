package day43_OOP_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable ); //public access modifier is reachable within the same package
        System.out.println(AccessModifiers.defaultVariable); //default access modifier is reachable within the same package
        //     System.out.println(AccessModifiers.privateVariable); //private access modifier is not reachable within the same package



    }

}
