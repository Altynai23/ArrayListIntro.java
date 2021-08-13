package day44_Recap.personTask;

import java.time.LocalDate;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("John", 'M', LocalDate.of(1990, 8, 14), "USA", "English");
        System.out.println(person1);

        person1.setName("Shay");
        person1.setGender('F');

        System.out.println(person1.getName());
        System.out.println(person1);


    }


}
