package Unit;

import java.util.ArrayList;

public abstract class Withers extends Pers {

    protected int mana;
    protected int maxmana;

    public int getPray(){

        return 0;
    }

    public int getHealing(){

        return 0;
    }

    public Withers(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int mana, int maxmana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.mana = mana;
        this.maxmana = maxmana;
        
    }
    public int getmana() {
        return mana;
    }
    public void step(ArrayList<Pers> team1, ArrayList<Pers> team2) {
        ArrayList<Pers> findLive = super.findLive(team1);
        if(hp > 0 ) {
            mana = ((mana += 2) > maxmana) ? maxmana : mana + 2;
            if (mana > 9) {
                for (Pers hero : findLive) {
                    if (hero.getHp() < hero.getMaxhp()) {
                        healing(hero);
                        mana -= 10;
                        return;
                    }
                }
            }
        }
     }
 
     protected void healing(Pers hero){
         float newHp = hero.getHp() - attack;
         if(newHp > hero.getMaxhp()){
             hero.setHp((float)hero.getMaxhp()-18);
         } else {
             hero.setHp(newHp);
         }
     }


}
