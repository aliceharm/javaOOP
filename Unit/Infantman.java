package Unit;

public class Infantman extends Manman{

    public Infantman(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        
    }
    public Infantman(String name){
        super(name, false, 30, 50, 2, 3, 10, 10, 4, 100);
        super.name = name;
        
    };
      
        
    @Override
    public void step(int a) {}
    


    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
    
}
