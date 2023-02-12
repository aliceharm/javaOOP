package Unit;
public class Sniper extends Pers{

    protected int look;
    protected int cartrig;
    protected int unlook;

    public int getLooking(){

        return 0;
    }

    public int getUnLooking(){

        return 0;
    }

    public Sniper(String name, boolean sex, int hp, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, attack, protect, speed, stamina);
        this.look = look;
        this.cartrig = cartrig;
        this.unlook = unlook;
        //TODO Auto-generated constructor stub
    }
    
}
