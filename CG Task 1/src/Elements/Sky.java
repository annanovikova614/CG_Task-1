package Elements;

import com.company.Drawable;

import java.awt.*;

public class Sky implements Drawable {
    int height;
    int width;
    int x;
    int y;

    public Sky(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(135, 206, 235));
        g.fillRect(x, y, width, height);
    }
}
