package Elements;

import com.company.DrawPanel;
import com.company.Drawable;

import java.awt.*;

public class Cloud implements Drawable {
    int height;
    int width;
    int[] CLOUDxNumerator;
    int[] ClOUDyNumerator;

    public Cloud(int height, int width, int[] CLOUDxNumerator, int[] CLOUDyNumerator) {
        this.height = height;
        this.width = width;
        this.CLOUDxNumerator = CLOUDxNumerator;
        this.ClOUDyNumerator = CLOUDyNumerator;
    }
    DrawPanel dp = new DrawPanel();

    @Override
    public void draw(Graphics2D g) {
        int i;

        for (i = 0; i < dp.getCLOUDi(); i++){
            g.setColor(Color.white);
            g.fillOval(width * CLOUDxNumerator[i] / 100, height * ClOUDyNumerator[i] / 100, width / 10, height / 20);
            g.fillOval(width * CLOUDxNumerator[i] / 100 + width / 50, height * ClOUDyNumerator[i] / 100 - height / 60, width / 20, height / 20);
            g.fillOval(width * CLOUDxNumerator[i] / 100 + width / 37, height * ClOUDyNumerator[i] / 100 - height / 55, width / 15, height / 15);


        }

    }
}
