package Unit;
public class Farmman extends Manman{

    




    public Farmman(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        
    }
    public Farmman(String name){
        super(name, false, 30, 50, 2, 2, 5, 15, 5, 100);
        super.name = name;
        
    };
        
        
    @Override
    public void step(int a) {}
    


    @Override
    public String getInfo() {
        return "Я Фермер!";
    }


    
}
