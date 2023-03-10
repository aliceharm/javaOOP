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
        if (state.equals("Die")) return;
        if (mana > 4){
            for (Pers human : team1) {
                if (human.hp < human.maxhp) {
                    healing(human);
                    mana -= 5;
                    return;
                }
            }
        } else {
            int index = findNearest(team2);
            if (team2.get(index).hp - 1 <= 0) {
                team2.get(index).state = "Die";
                team2.get(index).hp = 0;
            } else {
                team2.get(index).hp -= 1;
            }
        }
    }
 
    @Override
    public String toString() {
        return name + "\t" +
                getEmoji() +
                "\t| \uD83E\uDE78:" + Math.round(hp) +
                "\t\uD83D\uDEE1:" + protect +
                " \t\uD83D\uDD2E:" + attack +
                " \t\uD83D\uDCA5:" + Math.round(Math.abs((1+attack)/2)) +
                " \t\uD83D\uDCA7:" + mana + "  ";
    }


    @Override
    public String getInfo() {
        return "";
    }
    protected void healing(Pers human) {
        float newHp = human.getHp()-attack;
        if (newHp > human.getMaxhp()) {
            human.sethp(human.getMaxhp());
        } else {
            human.sethp(newHp);
        }
    }
}