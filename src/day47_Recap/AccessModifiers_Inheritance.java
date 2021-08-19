package day47_Recap;

import Utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

    public void method(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable); // protected can be visible outside package if there is a subclass
        //  System.out.println(defaultVariable); // default is only visible within the smae package
        //   System.out.println(privateVariable); // private is not visible outside the class

        publicMethod();
        protectedMethod();
        //    defaultMethod(); // default is only visible within the smae package
        //    privateMethod(); //private is not visible outside the class

    }






}
