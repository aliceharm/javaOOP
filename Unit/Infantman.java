package Unit;

public class Infantman extends Manman{

    public Infantman(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        
    }
    public Infantman(String name, int x, int y){
        super(name, false, 30, 50, x, y, 10, 10, 4, 100);
        
        
    };
      
        
  
    


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(Infantman.super.name)
                .append("\t| HP: \t").append(Infantman.super.hp)
                .append("\t| MaxHP: \t").append(Infantman.super.maxhp)
                .append("\t|\t\t")
                .append("\t| X.Y: \t").append("(").append(Infantman.super.pos.x)
                .append(",").append(Infantman.super.pos.y).append(")")
                .append("\t State: \t").append(Infantman.super.state).append("\n");
    }
    
}
