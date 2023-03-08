package Unit;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Barrier {
    protected Vector2d pos;
    protected String barrieraEmodji;

    public String getBarrieraEmodji() {
        return barrieraEmodji;
    }

    public Barrier(Vector2d vector2d) {

        this.pos = vector2d;
        this.barrieraEmodji = getEmodjiBarrier();
    }
    protected String getEmodjiBarrier() {
        List<String> strBarrier = Arrays.asList("🗿", "🪵", "🪨");
        return strBarrier.get(new Random().nextInt(3));
    }
    public int[] getCoords() { return new int[]{pos.x, pos.y};}

}
    

