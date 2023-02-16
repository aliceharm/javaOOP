import Unit.Bandit;
import Unit.Farmman;
import Unit.Infantman;
import Unit.Monk;
import Unit.Pers;
import Unit.Shooter;
import Unit.Sniper;
import Unit.Wizard;

public class Main {
    public static void main(String[] args) {
        Pers Pers1 = new Farmman("Nik");
        Pers Pers2 = new Bandit("Joker");
        Pers Pers3 = new Infantman("Kol");
        Pers Pers4 = new Sniper("Look");
        Pers Pers5 = new Shooter("Shoot");
        Pers Pers6 = new Wizard("Harry");
        Pers Pers7 = new Monk("Took"); 

        System.out.println(Pers1.getInfo());
        System.out.println(Pers2.getInfo());
        System.out.println(Pers3.getInfo()); 
        System.out.println(Pers4.getInfo()); 
        System.out.println(Pers5.getInfo()); 
        System.out.println(Pers6.getInfo()); 
        System.out.println(Pers7.getInfo());     
    }
    
    
}
