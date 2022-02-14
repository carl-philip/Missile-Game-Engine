package GameNgn.ui;

import java.awt.*;

public class UIButton extends UIObject {

    private String text;
    private ClickListner clicker;
    private Color color;

    public UIButton(float x, float y, int width, int height, String text, Color color, ClickListner clicker) {
        super(x, y, width, height);
        this.text = text;
        this.color = color;
        this.clicker = clicker;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        if(hovering) {
            g.setColor(color.darker());
        }
        g.fillRect((int) x, (int) y, width, height);
        g.setColor(Color.BLACK);

        // TODO: variabel fontSize
        int fontSize = 36;
        Font font = new Font("SansSerif", Font.PLAIN, fontSize);
        g.setFont(font);
        g.drawString(text, (int) x + (width - text.length()*((int) (fontSize*0.9f)) / 2) / 2, (int) y + (height - 10 + fontSize) / 2);
    }

    @Override
    public void onClick() {
        clicker.onClick();
    }
}
