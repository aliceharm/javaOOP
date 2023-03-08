package Unit;

import java.util.ArrayList;

public class Vector2d {
    public int x, y;

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double getDistance(Vector2d oponent){
        return Math.sqrt(Math.pow(x - oponent.x,2) + Math.pow(y - oponent.y,2));

    }
    protected boolean getLeft(Vector2d opponent) {
        return opponent.x < x;
    }
    protected boolean getDown(Vector2d opponent) {
        return opponent.y < y;
    }

    protected boolean getEmpty(ArrayList <Pers> team,ArrayList<Barrier> barriers, int posX, int posY) {
        boolean bool = true;
        for (Pers human: team) {
            if (human.pos.x == x & human.pos.y == y) {
                bool = false;
                break;
            }
        }
        for (Barrier barr: barriers){
            if (barr.pos.x == x & barr.pos.y == y) {
                bool = false;
                break;
            }
        }
        return bool;
    }
    
}
