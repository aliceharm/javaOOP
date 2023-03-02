package Unit;


public class Sniper extends Strelok{

    



    public Sniper(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, look, cartrig, unlook);

        
    }
    public Sniper(String name, int x, int y){
        super(name, true, 15, 50, x, y, 20, 5, 5, 100, 20, 22, 15);
        
        
    };
        
        
   
    


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(Sniper.super.name)
                .append("\t| HP: \t").append(Sniper.super.hp)
                .append("\t| MaxHP: \t").append(Sniper.super.maxhp)
                .append("\t| Arrows: \t").append(Sniper.super.getcartrig())
                .append("\t| X.Y: \t").append("(").append(Sniper.super.pos.x)
                .append(",").append(Sniper.super.pos.y).append(")")
                .append("\t State: \t").append(Sniper.super.state).append("\n");

    }

}
