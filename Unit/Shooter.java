package Unit;
public class Shooter extends Strelok{


    

    public Shooter(String name, boolean sex, int hp,int maxhp, int attack, int x, int y, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, look, cartrig, unlook);
        super.name = name;

        
        
    }
    public Shooter(String name, int x, int y){
        super(name, true, 15, 50, x, y, 15, 10, 5, 100, 10, 22, 10);
        
        
    };
    @Override
    public String getProfession() {
        return "Арбалет";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDDD\u200D♀️";
    }

    public String getInfo() {
        return "Арбалетчик";}
    
}
