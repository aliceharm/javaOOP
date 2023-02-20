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

    public Bandit(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int unlook, int luck) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.unlook = unlook;
        this.luck = luck;
        
    }
    public Bandit(String name){
        super(name, true, 20, 50, 4, 2, 5, 20, 5, 100);
        super.name = name;
        
    };

    @Override
    public void step(int a) {}


    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }
}
