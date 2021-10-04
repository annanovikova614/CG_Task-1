package Elements;

import com.company.DrawPanel;
import com.company.Drawable;

import java.awt.*;

public class Home implements Drawable {
    int height;
    int width;
    int x;
    int y;

    public Home(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        int[] xRoof = {x, x + width / 2, x + width};
        int[] yRoof = {y, y - height / 2, y};
        int i;

        g.setColor(new Color(222, 184, 135)); // фасад здания
        g.fillRect(x, y, width, height);
        g.setColor(new Color(160, 82, 45));
        g.drawRect(x, y, width, height);


        g.setColor(new Color(255, 99, 71)); // крыша здания
        g.fillRect(x + width / 8, y - height / 3, width / 6, height / 3); // труба здания
        g.fillPolygon(xRoof, yRoof, 3);
        g.setColor(new Color(139, 0, 0));
        g.drawPolygon(xRoof, yRoof, 3);


        g.setColor(new Color(139, 69, 19)); // дверь здания
        g.fillRect(x + width / 8, y + height / 2, width / 6, height / 2 );
        g.setColor(new Color(128, 128, 0));
        g.drawRect(x + width / 8, y + height / 2, width / 6, height / 2 );
        g.fillOval(x + width / 8, y + height * 7 / 10 , width / 16, height / 12  ); // ручка двери


        int[] xPavement = {x, x + width / 8, x + width / 8 + width / 6, x + width / 8 + width / 6 + width / 8};
        int[] yPavement = {y + height / 10 * 24 , y + height, y + height, y + height / 10 * 24};
        g.setColor(new Color(255, 222, 173)); // тропинка к дому
        g.fillPolygon(xPavement, yPavement, 4);




        g.setColor(new Color(135, 206, 235)); // окно здания
        g.fillRect(x + width / 2, y + height / 5, width / 3, height / 2 );
        g.setColor(Color.BLACK);
        g.drawRect(x + width / 2, y + height / 5, width / 3, height / 2 );
        g.drawLine(x + width / 2 + width / 6, y + height / 5, x + width / 2 + width / 6, y + height / 5 + height / 2);
        g.drawLine(x + width / 2, y + height / 5 + height / 4, x + width / 2 + width / 3, y + height / 5 + height / 4);



    }
}
