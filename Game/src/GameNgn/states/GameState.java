package GameNgn.states;

import GameNgn.Game;
import GameNgn.Handler;
import GameNgn.entities.EntityManager;
import GameNgn.entities.creatures.Player;
import GameNgn.entities.creatures.Target;
import GameNgn.gfx.Assets;

import java.awt.*;

public class GameState extends State{

    private EntityManager entityManager; // TODO: sätta entityManager i en World class wom uppdatterar allt från enitities till kamera och effekter

    public GameState(Handler handler){
        super(handler);
        entityManager = new EntityManager();

        entityManager.addEntity(new Player(handler, 100, 100, 0, 0));
        entityManager.addEntity(new Target(handler, 400, 100, -5, 0));
    }

    @Override
    public void tick(){
        entityManager.tick();
    }

    @Override
    public void render(Graphics g){
        entityManager.render(g);
    }

}
