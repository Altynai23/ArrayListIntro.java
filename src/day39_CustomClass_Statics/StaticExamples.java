package day39_CustomClass_Statics;

class CybertekStudent{

    public String name, gender;
    public int age, ID;
    public static String schoolName = "Cybertek School";
    public static String programmingLanguage = "Java";


    public void printName(){
        System.out.println(name);
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public void method2(){
        System.out.println(schoolName);
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(ID);
        System.out.println(schoolName);
        System.out.println(programmingLanguage);
    }




}




public class StaticExamples {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();
        CybertekStudent student3 = new CybertekStudent();
        CybertekStudent student4 = new CybertekStudent();

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(student3.schoolName);
        System.out.println(student4.schoolName);
        System.out.println("----------------------------------");
        System.out.println(student1.programmingLanguage);
        System.out.println(student2.programmingLanguage);
        System.out.println(student3.programmingLanguage);
        System.out.println(student4.programmingLanguage);

        System.out.println("----------------------------------");

        System.out.println(CybertekStudent.schoolName);
        System.out.println(CybertekStudent.programmingLanguage);

        System.out.println(student1.age);
        //System.out.println(CybertekStudent.age);

        CybertekStudent.printSchoolName();


    }




}
