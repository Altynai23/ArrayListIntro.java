package day42_CustomClassConstructors;

public class ConstructorCalls {

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1(); // "Method 1"
        System.out.println("Method 2");
    }

    public static void method4(){
        method1();
        method2();
    }


    public  void method3(){
        // ConstructorCalls();
        //   this();
    }

    public ConstructorCalls(){ //Method 1, Method 1,  Method 2,Default Constructor
        method1(); // Method 1
        method2(); //Method 1, Method 2
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){ //Method 1, Method 1, Method 2, Default Constructor, Constructor with int arg
        this(); // calling no-arg constructor
        System.out.println("Constructor with int arg");

    }


    public ConstructorCalls(String str){
        this();
        // this(10);
        System.out.println("Constructor with string arg");

    }



    public static void main(String[] args) {
        method2();

        System.out.println("--------------------------------");

        new ConstructorCalls();

        System.out.println("---------------------------------");

        new ConstructorCalls(10);

    }




}
