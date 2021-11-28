package prog1.lab3;
import prog1.lab3.abstract_classes.*;
import prog1.lab3.enums.*;
import prog1.lab3.interfaces.*;
import prog1.lab3.heroes.*;
import java.io.PrintStream;

public class Story {
    public static PrintStream so = System.out;
    
    public static void main(String[] args) {
        so.println("--------------------");

        Medunica m = new Medunica(Job.DOCTOR, Status.SERENITY, Place.HOSPITAL);
        Vorchun v = new Vorchun(Job.FRESHMAN, Status.SICK, Place.ITMO);
        v.setPlace(Place.HOSPITAL);
        m.inspection(v);
        v.setJob(Job.PATIENT);
        
        so.println();

        v.escapeDecision();
        v.stealClothes();
        v.setPlace(Place.FOREST);
        m.startSearch(v);
        v.setPlace(Place.THICKETS);
        v.hide();
        v.look();

        so.println();

        v.promise();
        m.stopSearch();

        so.println("--------------------");
    }
}