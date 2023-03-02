package Unit;

public class Vector2d {
    public int x, y;

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double getDistance(Vector2d oponent){
        return Math.sqrt(Math.pow(x - oponent.x,2) + Math.pow(y - oponent.y,2));

    }
    
}
