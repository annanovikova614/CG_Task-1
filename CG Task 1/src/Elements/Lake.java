package Elements;

import com.company.Drawable;

import java.awt.*;

public class Lake implements Drawable {
    int height;
    int width;
    int x;
    int y;

    public Lake(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(135, 206, 235));
        g.fillOval(x, y, width / 2, height / 5);
    }
}
