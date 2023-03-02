package Unit;

import java.util.ArrayList;

public abstract class Strelok extends Pers{

    protected int look;
    protected int cartrig;
    protected int unlook;

    public int getLooking(){

        return 0;
    }

    public int getUnLooking(){

        return 0;
    }

    public Strelok(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina, int look, int cartrig, int unlook) {
        super(name, sex, hp, maxhp, x, y, attack, protect, speed, stamina);
        this.look = look;
        this.cartrig = cartrig;
        this.unlook = unlook;
        
    }

    public int getcartrig(){
        return cartrig;
    }
    
    @Override
    public void step(ArrayList<Pers> team1, ArrayList<Pers> team2) {
        if (hp > 0) {
            if (cartrig > 0) {
                int index = super.findNearest(team2);
                makeDamage(team2.get(index));
                if (findFarmer(team1)) {
                    return;
                }
                cartrig --;
            }
        }
    }

    protected boolean findFarmer(ArrayList<Pers> teams){
        ArrayList<Pers> arrayFarmer = new ArrayList<>();
        for (Pers hero : teams){
            if(hero.getInfo().toString().split(":")[0].equals("Фермер")
                    && ((Farmman)hero).getArrowsFarmer() > 0){
                    arrayFarmer.add(hero);
            }
        }

    
    switch (arrayFarmer.size()){
        case(0):
            return false;
        case (1):
            ((Farmman) arrayFarmer.get(0)).setArrowsFarmer(0);
            return true;
        default:
            ((Farmman) arrayFarmer.get(findNearest(arrayFarmer))).setArrowsFarmer(0);
            return true;
    }
}




}
    
    

    

