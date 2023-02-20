package Unit;

public abstract class Strelok extends Pers{

    protected int look;
    protected int cartrig;
    protected int unlook;

    public int getLooking(){

        return 0;
    }

    public int getUnLooking(){

        return 0;
    }

    public Strelok(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.look = look;
        this.cartrig = cartrig;
        this.unlook = unlook;
        
    }

    

    
}
