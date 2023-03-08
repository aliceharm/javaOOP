package Unit;

import java.util.ArrayList;

public abstract class Manman extends Pers{

    public Manman(String name, boolean sex, float hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        
    }
    
    public void step(ArrayList<Pers> team1, ArrayList<Pers> team2, ArrayList<Barrier> barriers) {
        if (state.equals("Die")) return;
        int index = findNearest(team2);
        Pers enemy = team2.get(index);
        if (pos.getDistance(enemy.pos) < 2) {
            makeDamage(team2.get(index));
            return;
        }
        if (pos.getDown(enemy.pos)) {
            if (pos.y - 1 > enemy.pos.y && pos.getEmpty(team1, barriers, pos.x, pos.y - 1)) {
                stepDown();
            } else {
                sidestep(team1, barriers, enemy);
            }
        }else {
            if (pos.y + 1 < enemy.pos.y && pos.getEmpty(team1, barriers, pos.x, pos.y + 1)) {
                stepUp();
           } else {
                sidestep(team1, barriers, enemy);
           }
       }
    }
    protected void stepDown() {
        pos.y -= 1;
    }

    protected void stepUp() {
        pos.y += 1;
    }

    protected void sidestep(ArrayList<Pers> team, ArrayList<Barrier> barriers, Pers enemy) {
        if (pos.getLeft(enemy.pos)) {
            if (pos.getEmpty(team, barriers,pos.x - 1, pos.y)){
                pos.x -= 1;
            }
        } else {
            if (pos.getEmpty(team, barriers,pos.x + 1, pos.y)) {
                pos.x += 1;
            }
        }
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
                .append("\t|");
    }
    
}
