package Unit;
public class Sniper extends Strelok{

    



    public Sniper(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, look, cartrig, unlook);

        
    }
    public Sniper(String name){
        super(name, true, 15, 50,10,1, 20, 5, 5, 100, 20, 22, 15);
        super.name = name;
        
    };
        
        
    @Override
    public void step(int a) {}
    


    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }
}
