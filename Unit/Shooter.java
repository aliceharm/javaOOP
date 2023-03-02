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
    public void step(int a) {}
    
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик:  \t").append(Shooter.super.name)
                .append("\t| HP: \t").append(Shooter.super.hp)
                .append("\t| MaxHP: \t").append(Shooter.super.maxhp)
                .append("\t| Arrows: \t").append(Shooter.super.getcartrig())
                .append("\t| X.Y: \t").append("(").append(Shooter.super.pos.x)
                .append(",").append(Shooter.super.pos.y).append(")")
                .append("\t State: \t").append(Shooter.super.state).append("\n");
    }
    
}
