package day41_CustomClass_Constructor;

public class ConstructorsIntro {

    /*
    public ConstructorsIntro(){
        System.out.println("Default Constructor");
    }
     */

    public ConstructorsIntro(int a){
        System.out.println("Constructor with int arg");
    }

    public static void main(String[] args) {

        //new ConstructorsIntro();
        new ConstructorsIntro(10);


    }





}
