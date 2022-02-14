package GameNgn.entities.creatures;

import GameNgn.Game;
import GameNgn.Handler;
import GameNgn.gfx.Assets;

import java.awt.*;

public class Player extends Creature{

    public Player(Handler handler, float px, float py, float vx, float vy){
        super(handler, px, py, vx, vy);
    }

    @Override
    public void tick(){
        float vx = (px - opx) * 0.999f;
        float vy = (py - opy) * 0.999f;

        opx = px;
        opy = py;
        px += vx;
        py += vy;
        py += 0.5f;

        if(handler.getKeyManager().up)
            py -= 1f;
        if(handler.getKeyManager().down)
            py += 1f;
        if(handler.getKeyManager().left)
            px -= 1f;
        if(handler.getKeyManager().right)
            px += 1f;

        if(px > handler.getWidth() - 10)
        {
            px = handler.getWidth() - 10;
            opx = px + vx * 0.99f;
            opy = py - vy * 0.99f;
        }
        else if(px < 0) {
            px = 0;
            opx = px + vx * 0.99f;
            opy = py - vy * 0.99f;
        }
        if(py > handler.getHeight() - 10)
        {
            py = handler.getHeight() - 10;
            opx = px - vx * 0.99f;
            opy = py + vy * 0.99f;
        }
        else if(py < 0) {
            py = 0;
            opx = px - vx * 0.99f;
            opy = py + vy * 0.99f;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) px, (int) py, null);
    }
}
