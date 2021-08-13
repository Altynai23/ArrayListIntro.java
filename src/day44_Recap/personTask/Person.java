package day44_Recap.personTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private char gender;
    private final int age ;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;

    public final static boolean isHuman ;
    public final static String planet ;

    static {
        isHuman = true;
        planet = "Earth";
    }

    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
        setName(name);
        setGender(gender);
        if(dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth = null;
        } // age cannot be negative

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(name+" is drinking "+drinks);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "Person{" +
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", age= " + age +
                ", dateOfBirth= " + dateOfBirth.format(df) + //Aug
                ", countryOfBirth= '" + countryOfBirth + '\'' +
                ", language= '" + language + '\'' +
                '}';
    }

}
