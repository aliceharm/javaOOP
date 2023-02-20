package Unit;
public class Wizard extends Withers{

    public Wizard(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina,
            int mana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, mana);
        
    }
    public Wizard(String name){
        super(name, true, 20, 50, 5, 10, 5, 20, 5, 100, 20);
        super.name = name;
        
    };
    @Override
    public void step(int a) {}

    @Override
    public String getInfo() {
        return "Я Волшебник!";
    }

}
