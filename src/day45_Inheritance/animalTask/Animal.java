package day45_Inheritance.animalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public static boolean sleeps = true;
    public static boolean breath = true;

    public void setInfo(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name +" is drinking "+drink);
    }

    public void sleep(String sleep){
        System.out.println(name +" is sleeping "+sleep);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void sleep() {
    }
}
