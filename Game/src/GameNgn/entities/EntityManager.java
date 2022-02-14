package GameNgn.entities;

import GameNgn.Handler;

import java.awt.*;
import java.util.ArrayList;

public class EntityManager {

    ArrayList<Entity> entities;

    public EntityManager() {
        entities = new ArrayList<Entity>();
    }

    public void tick() {
        for(Entity e : entities)
            e.tick();

        // TODO: kollision, abs(x) + abs(y) < n mellan två obj sedan en detaljerad kollisionsdetektion
    }

    public void render(Graphics g) {
        for(Entity e : entities)
            e.render(g);
    }

    public void addEntity(Entity e) {
        entities.add(e);
    }

    public void removeEntity(Entity e) {
        entities.remove(e);
    }
}
