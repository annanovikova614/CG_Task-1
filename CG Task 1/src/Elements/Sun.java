package Elements;

import com.company.Drawable;

import javax.swing.*;
import java.awt.*;

public class Sun implements Drawable {
    int x;
    int y;
    int r;
    int R;
    int n;

    public Sun(int x, int y, int r, int r1, int n) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++){
            int dx1, dx2, dy1, dy2;
            dx1 = (int)(x + r * Math.cos(da * i));
            dy1 = (int)(y + r * Math.sin(da * i));
            if (i % 2 == 0){
                dx2 = (int)(x + (R / 1.5) * Math.cos(da * i));
                dy2 = (int)(y + (R / 1.5) * Math.sin(da * i));
            }else{
                dx2 = (int)(x + (R / 1.25) * Math.cos(da * i));
                dy2 = (int)(y + (R / 1.25) * Math.sin(da * i));
            }
            g.drawLine(dx1, dy1, dx2, dy2);
        }

    }
}
