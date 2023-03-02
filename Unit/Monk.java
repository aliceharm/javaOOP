package Unit;

public class Monk extends Withers{


    
    public Monk(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int mana, int maxmana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, mana, maxmana);
        
    }

    public Monk(String name, int x, int y){
        super(name, true, 20, 50, x, y, 5, 20, 5, 100, 20, 50);
        
        
    };


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| HP: \t").append(Monk.super.hp)
                .append("\t| MaxHP: \t").append(Monk.super.maxhp)
                .append("\t| Magic: \t").append(Monk.super.getmana())
                .append("\t| X.Y: \t").append("(").append(Monk.super.pos.x)
                .append(",").append(Monk.super.pos.y).append(")")
                .append("\t State: \t").append(Monk.super.state).append("\n");
    }
    
}
