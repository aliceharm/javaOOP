package Unit;


public class Sniper extends Strelok{

    



    public Sniper(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, look, cartrig, unlook);

        
    }
    public Sniper(String name, int x, int y){
        super(name, true, 15, 50, x, y, 20, 5, 5, 100, 20, 22, 15);
        
        
    };
    @Override
    public String getProfession() {
        return "Снайпер";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDDD";
    }

    @Override
    public String getInfo() {
        return "Cнайпер";
    }

}
