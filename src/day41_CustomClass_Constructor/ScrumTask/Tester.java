package day41_CustomClass_Constructor.ScrumTask;

public class Tester {

    public String name;
    public char gender;
    public String jobTitle;
    public int id;
    public static double salary;

    public static boolean isCybertekStudent;
    public static boolean isEmployeed;

    static{
        isCybertekStudent = true;
        isEmployeed = true;
    }

    public Tester(String name, char gender, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }





}
