package Unit;
public class Wizard extends Withers{

    public Wizard(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina,
            int mana, int maxmana) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina, mana, maxmana);
        
    }
    public Wizard(String name, int x, int y){
        super(name, true, 20, 50, x, y, 5, 20, 5, 100, 20, 50);
        
        
    };
    @Override
    public void step(int a) {}

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Маг: \t\t").append(Wizard.super.name)
                .append("\t| HP: \t").append(Wizard.super.hp)
                .append("\t| MaxHP: \t").append(Wizard.super.maxhp)
                .append("\t| Magic: \t").append(Wizard.super.getmana())
    //            .append("\t\t\t\t")
                .append("\t| X.Y: \t").append("(").append(Wizard.super.pos.x)
                .append(",").append(Wizard.super.pos.y).append(")")
                .append("\t State: \t").append(Wizard.super.state).append("\n");
    }

}
