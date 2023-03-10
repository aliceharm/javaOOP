package Unit;

public class Infantman extends Manman{

    public Infantman(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        
    }
    public Infantman(String name, int x, int y){
        super(name, false, 30, 50, x, y, 10, 10, 4, 100);
        
        
    };
    @Override
    public String getProfession() {
        return "Копейщик";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83D\uDC77\u200D♂️";
    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }
    
}
