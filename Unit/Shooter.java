package Unit;
public class Shooter extends Strelok{


    

    public Shooter(String name, boolean sex, int hp,int maxhp, int attack, int x, int y, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, look, cartrig, unlook);
        super.name = name;

        
        
    }
    public Shooter(String name){
        super(name, true, 15, 50, 0, 1, 15, 10, 5, 100, 10, 22, 10);
        super.name = name;
        
    };
        

    @Override
    public void step(int a) {}
    
    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
    
}
