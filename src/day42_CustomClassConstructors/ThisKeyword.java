package day42_CustomClassConstructors;

public class ThisKeyword {

    int a;
    static int b;

    public void method1(){
        System.out.println("Instance method");
    }

    public static void method2(){
        System.out.println("Static method");
    }


    public ThisKeyword(){
        System.out.println( this.a);
        this.method1();
    }

    //System.out.println("this.b"); static prefers to be called through class name
    //this.method2();





}
