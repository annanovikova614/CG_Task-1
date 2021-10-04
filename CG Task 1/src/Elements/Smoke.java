package Elements;

import com.company.DrawPanel;
import com.company.Drawable;

import java.awt.*;

public class Smoke implements Drawable {
    int height;
    int width;
    int[] SMOKExNumerator;
    int[] SMOKEyNumerator;

    public Smoke(int height, int width, int[] SMOKExNumerator, int[] SMOKEyNumerator) {
        this.height = height;
        this.width = width;
        this.SMOKExNumerator = SMOKExNumerator;
        this.SMOKEyNumerator = SMOKEyNumerator;
    }

    DrawPanel dp = new DrawPanel();

    @Override
    public void draw(Graphics2D g) {
        int i;
        for (i = 0; i < dp.getSMOKEi(); i++) {
            g.setColor(Color.white);
            g.fillOval(width * SMOKExNumerator[i] / 100, height * SMOKEyNumerator[i] / 100, width / 20, height / 20);
        }
    }
}