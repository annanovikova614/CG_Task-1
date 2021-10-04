package Elements;

import com.company.Drawable;

import java.awt.*;

public class Ground implements Drawable {
    int height;
    int width;
    int x;
    int y;

    public Ground(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(50, 205, 50));
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);

    }
}
