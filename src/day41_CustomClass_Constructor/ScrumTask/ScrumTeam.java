package day41_CustomClass_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }

    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void hireTester(Tester[] testers){
        this.testers.addAll( Arrays.asList(testers) );
    }

    public void removeTester(int id){
        testers.removeIf(tester -> tester.id == id );
    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int id){
        developers.removeIf( developer -> developer.id == id );
    }




}
