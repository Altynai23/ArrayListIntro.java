package day41_CustomClass_Constructor.scrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {

    Tester tester1 = new Tester("Yuliang", 'M', "QA", 10, 110000);
    Tester tester2 = new Tester("Abbos", 'M', "SM", 11, 115000);
    Tester tester3 = new Tester("Selda", 'F', "SM", 10, 115000);

        Tester[] testers = {tester2, tester3};


        Developer developer1 = new Developer("Zorana", 'F', "Software Developer",13, 125000);
        Developer developer2 = new Developer("Mehmet", 'M', "Java Developer", 14, 130000);
        Developer developer3 = new Developer("Yuliia", 'F', "Software Developer", 15, 125005);
        Developer developer4 = new Developer("Yasin", 'M', "Java Developer", 16, 122000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Shazia", "Fhilipp", "Aysu");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        scrum1.hireTester(  new Tester("Tugba", 'F', "SDET", 9, 118000)  );

        System.out.println(scrum1);

        double budget = 0;

        for(Tester eachTester  : scrum1.testers){
            budget += eachTester.salary;
        }

        for (Developer eachDeveloper : scrum1.developers) {
            budget +=  eachDeveloper.salary ;
        }

        System.out.println("budget = " + budget);

        ScrumTeam scrum2 =new ScrumTeam("", "", ""); // add 5 testers & 6 developers
        ScrumTeam scrum3 =new ScrumTeam("", "", ""); // add 2 testers & 4 developers

        ScrumTeam[] scrumTeams ={scrum1, scrum2, scrum3};

        /*
        for (ScrumTeam eachScrum : scrumTeams) {
            for (Tester tester : eachScrum.testers) {
            }
            for (Developer developer : eachScrum.developers) {

         */
            }






}
