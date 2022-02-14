package GameNgn.entities;

import GameNgn.Handler;

import java.awt.*;

public abstract class Entity {

    protected Handler handler;
    protected float px, py;

    public Entity(Handler handler, float px, float py){
        this.handler = handler;
        this.px = px;
        this.py = py;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
