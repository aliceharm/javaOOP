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
        Pers Persfarm = new Farmman("Nik", false, 10, 5, 5,5, 100);
        Pers Persband = new Bandit("Joker", false, 10, 10, 5, 6, 100);
        Pers Persinfa = new Infantman("Kol", false, 15, 20, 10, 5, 100);
        Pers Perssnip = new Sniper("Look", true, 10, 25, 5, 6, 100);
        Pers Persshoo = new Shooter("Shoot", false, 20, 20, 15, 6, 100);
        Pers perswiza = new Wizard("Harry", false, 30, 15, 25, 4, 100);
        Pers persmonk = new Monk("Took", false, 30, 15, 25, 4, 100); 

        
    }
    
}
