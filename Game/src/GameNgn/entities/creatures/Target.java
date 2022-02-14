package GameNgn.entities.creatures;

import GameNgn.Game;
import GameNgn.Handler;
import GameNgn.gfx.Assets;

import java.awt.*;

public class Target extends Creature{

    public Target(Handler handler, float px, float py, float vx, float vy){
        super(handler, px, py, vx, vy);
    }

    @Override
    public void tick(){
        float vx = (px - opx) * 0.99f + (handler.getMouseManager().getMouseX() - opx) / 1000;
        float vy = (py - opy) * 0.99f + (handler.getMouseManager().getMouseY() - opy) / 1000;

        opx = px;
        opy = py;
        px += vx;
        py += vy;
        py += 0.01f;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.target, (int) px, (int) py, null);
    }
}
