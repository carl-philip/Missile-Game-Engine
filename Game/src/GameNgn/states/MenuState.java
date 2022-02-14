package GameNgn.states;

import GameNgn.Game;
import GameNgn.Handler;
import GameNgn.ui.ClickListner;
import GameNgn.ui.UIButton;
import GameNgn.ui.UIManager;

import java.awt.*;

public class MenuState extends State {

    private UIManager uiManager;

    public MenuState(Handler handler){
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUiManager(uiManager);

        uiManager.addObject(new UIButton(handler.getWidth()/2 - 50, handler.getHeight()/3 - 10, 100, 50, "Start", Color.GRAY, new ClickListner(){
            @Override
            public void onClick() {
                handler.getMouseManager().setUiManager(null);
                State.setState(handler.getGame().gameState);
            }
        }));
    }

    @Override
    public void tick(){
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }
}
