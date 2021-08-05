package day40_CustomClass_Statics;

import day38_CustomClass.employeeTask.Employee;

public class HumanResource {

    public static int z = 100;
    public static Employee employee1 = new Employee(); //Ahmet
    //employee1.setInfo("Ahmet", 'M',1,"SDET", 100000);
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();

    static {
        employee1.setInfo("Ahmet", 'M',1,"SDET", 100000);
        employee2.setInfo("John", 'M',2,"SDET", 120000);
        employee3.setInfo("Daniel", 'M',3,"QA", 120000);
        employee4.setInfo("Aaron", 'M',4,"SDET", 120000);
        employee5.setInfo("Chris", 'M',5,"BA", 120000);
    }





}
