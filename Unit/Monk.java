package Unit;

public class Monk extends Pers{
    protected int mana;

    public int getPray(){

        return 0;
    }

    public int getHealing(){

        return 0;
    }

    public Monk(String name, boolean sex, int hp, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, attack, protect, speed, stamina);
        this.mana = mana;
        //TODO Auto-generated constructor stub
    }
    
}
