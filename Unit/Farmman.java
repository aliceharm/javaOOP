package Unit;

import java.util.ArrayList;

public class Farmman extends Pers{

    protected int arrows;

    




    public Farmman(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int arrows) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.arrows = 1;
        
    }
    public Farmman(String name, int x, int y){
        super(name, false, 30, 50, x, y, 5, 15, 5, 100);
        
        
    };
        
        
    @Override
    public void step(ArrayList<Pers> team1, ArrayList<Pers> team2, ArrayList<Barrier> barriers) {
        if (state.equals("Die")) return;
        if (state.equals("Empty")) state = "Stand";
    }
    public int getArrowsFarmer() {
        return arrows;
    }

    public void setArrowsFarmer(int arrows) {
        this.arrows = arrows;
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Farmman.super.name)
                .append("\t| HP: \t").append(Farmman.super.hp)
                .append("\t| MaxHP: \t").append(Farmman.super.maxhp)
                .append("\t| Arrows: \t").append(Farmman.this.arrows)
                .append("\t| X.Y: \t").append("(").append(Farmman.super.pos.x)
                .append(",").append(Farmman.super.pos.y).append(")")
                .append("\t State: \t").append(Farmman.super.state).append("\n");
    }
    @Override
    public String getProfession() {
        return "Фермер";
    }

    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDD1\u200D\uD83C\uDF3E";
    }


    
}
