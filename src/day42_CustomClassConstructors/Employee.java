package day42_CustomClassConstructors;

public class Employee {

    public String name, jobTitle;
    public int id;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name); //  this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int id) {
        this(name, jobTitle); // this.name = name;,  this.jobTitle = jobTitle;
        this.id = id;
    }

    public Employee(String name, String jobTitle, int id, double salary) {
        this(name, jobTitle, id); // this.name = name;,  this.jobTitle = jobTitle;, this.id = id;
        this.salary = salary;
    }




    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }


}
