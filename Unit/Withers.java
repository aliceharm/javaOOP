package Unit;

public abstract class Withers extends Pers {

    protected int mana;

    public int getPray(){

        return 0;
    }

    public int getHealing(){

        return 0;
    }

    public Withers(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int mana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.mana = mana;
        
    }
    
}
