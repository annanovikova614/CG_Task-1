package Elements;

import com.company.Drawable;

import java.awt.*;

public class BackgroundForest implements Drawable {
    int height;
    int width;
    int x;
    int y;

    public BackgroundForest(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        int i;
        g.setColor(new Color(46, 139, 87));
        for (i = 0; i < 55; i++){
            g.fillOval(x + (width / 50 * i), y, width / 50, height);
        }


    }
}
