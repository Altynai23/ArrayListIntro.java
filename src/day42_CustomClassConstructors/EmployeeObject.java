package day42_CustomClassConstructors;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sabir");
        Employee employee2 = new Employee("Zulkhumor", "SDET");
        Employee employee3 = new Employee("Maftuna", "QA", 1234);
        Employee employee4 = new Employee("Ahmet", "SDET", 123456, 220001);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }

}
