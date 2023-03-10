package Unit;
public class Wizard extends Withers{

    public Wizard(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina,
            int mana, int maxmana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, mana, maxmana);
        
    }
    public Wizard(String name, int x, int y){
        super(name, true, 20, 50, x, y, 5, 20, 5, 100, 20, 50);
        
        
    };
    @Override
    public String getProfession() {
        return "Колдун";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\u200D\uD83E\uDDDB";
    }

    @Override
    public String getInfo() {
        return "Колдун";
    }

}
