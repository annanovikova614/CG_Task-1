package Elements;

import com.company.DrawPanel;
import com.company.Drawable;

import java.awt.*;

public class Trees implements Drawable {
    int height;
    int width;
    int[] TREExNumerator;
    int[] TREEyNumerator;

    public Trees(int height, int width, int[] TREExNumerator, int[] TREEyNumerator) {
        this.height = height;
        this.width = width;
        this.TREExNumerator = TREExNumerator;
        this.TREEyNumerator = TREEyNumerator;

    }
    DrawPanel dp = new DrawPanel();

    @Override
    public void draw(Graphics2D g) {
    int i;
        for (i = 0; i < dp.getTREEi(); i++){

            g.setColor(new Color(139, 69, 19));
            g.fillRect(width * TREExNumerator[i] / 100, height * TREEyNumerator[i] / 100, width / 55, height / 12);

            g.setColor(new Color(34, 139, 34));
            g.fillOval(width * TREExNumerator[i] / 100 - width / 30, height * TREEyNumerator[i] / 100 - height / 15, width / 12, height / 14);
            g.setColor(new Color(34, 139, 34));
            g.fillOval(width * TREExNumerator[i] / 100 - width / 30, height * TREEyNumerator[i] / 100 - height / 10, width / 12, height / 14);

        }

    }
}
