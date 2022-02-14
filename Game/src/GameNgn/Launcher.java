package GameNgn;

import GameNgn.display.Display;

public class Launcher {

    public static void main(String[] args){
        Game game = new Game("Plane Game!", 800, 600);
        game.start();
    }

}
