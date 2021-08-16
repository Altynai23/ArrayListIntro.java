package day45_Inheritance.animalTask;

public class Tiger extends Animal{// Tiger Is An animal

    public Tiger(String name, String breed, char gender, String size, int age, String color){
        setInfo(name, breed, gender, size, age, color);
    }

    public void roar(){
        System.out.println(name +" is raring");
    }

}
