package Unit;

import java.util.Random;

public class Bandit extends Manman{
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
    public String getProfession() {
        return "Бандит";
    }

    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDD77";
    }

    @Override
    public String getInfo() {
      return "Бандит";
    }
}
