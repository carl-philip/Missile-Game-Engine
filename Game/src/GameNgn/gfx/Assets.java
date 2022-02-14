package GameNgn.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, target, grass, stone, tree;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));

        player = sheet.crop(0 * width, 0 * height, width, height);
        target = sheet.crop(1 * width, 0 * height, width, height);
        grass = sheet.crop(2 * width, 0 * height, width, height);
        stone = sheet.crop(3 * width, 0 * height, width, height);
        tree = sheet.crop(0 * width, 1 * height, width, height);
    }

}
