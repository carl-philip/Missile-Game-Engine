package GameNgn.entities.creatures;

import GameNgn.Handler;
import GameNgn.entities.Entity;

public abstract class Creature extends Entity {

    protected float opx, opy;

    public Creature(Handler handler, float px, float py, float vx, float vy){
        super(handler, px, py);
        this.opx = px - vx;
        this.opy = py - vy;
    }

}
