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

    public Bandit(String name, boolean sex, float hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int unlook, int luck) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.unlook = unlook;
        this.luck = luck;
        
    }
    public Bandit(String name, int x, int y){
        super(name, true, 20, 50, x, y, 5, 20, 5, 100);
        

        
    };

   


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Bandit.super.name)
                .append("\t| HP: \t").append(Bandit.super.hp)
                .append("\t| MaxHP: \t").append(Bandit.super.maxhp)
                .append("\t|\t\t")
                .append("\t| X.Y: \t").append("(").append(Bandit.super.pos.x)
                .append(",").append(Bandit.super.pos.y).append(")")
                .append("\t State: \t").append(Bandit.super.state)
                .append("\n");
    }
}
