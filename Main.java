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
        Farmman Persfarm = new Farmman("Nik", false, 10, 5, 5,5, 100);
        Bandit Persband = new Bandit("Joker", false, 10, 10, 5, 6, 100);
        Infantman Persinfa = new Infantman("Kol", false, 15, 20, 10, 5, 100);
        Sniper Perssnip = new Sniper("Look", true, 10, 25, 5, 6, 100);
        Shooter Persshoo = new Shooter("Shoot", false, 20, 20, 15, 6, 100);
        Wizard perswiza = new Wizard("Harry", false, 30, 15, 25, 4, 100);
        Monk persmonk = new Monk("Took", false, 30, 15, 25, 4, 100); 

        
    }
    
}
