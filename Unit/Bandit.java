package Unit;

import java.util.Random;

public class Bandit extends Pers{
    protected int unlook;
    protected int luck;

    public int getUnLooking(){

        return 0;
    }
    public boolean getRob(){
        Random rnd = new Random();
        luck = rnd.nextInt(100);
        if (luck > 63) {
            return true;
        }
        else {
            return false;
        }

        
    }

    public Bandit(String name, boolean sex, int hp, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, attack, protect, speed, stamina);
        this.unlook = unlook;
        this.luck = luck;
        //TODO Auto-generated constructor stub
    }
    
}
