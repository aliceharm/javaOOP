package Unit;

public class Monk extends Withers{


    
    public Monk(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int mana, int maxmana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, mana, maxmana);
        
    }

    public Monk(String name, int x, int y){
        super(name, true, 20, 50, x, y, 5, 20, 5, 100, 20, 50);
        
        
    };

    @Override
    public String getProfession() {
        return "Монах";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDD9\u200D♂️";
    }

    @Override
    public String getInfo() {
        return "Монах";
    }
    
}
