package Utilities;

public class AccessModifiers_Inheritance extends Data2{
    // same package: public, protected, default

    public void method(){

        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        //System.out.println(privateVariable);// private is not visible outside the class

        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod();// private is not visible outside the class
    }
}
