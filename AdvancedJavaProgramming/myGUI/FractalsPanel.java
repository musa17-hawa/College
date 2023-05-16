import java.awt.Graphics;
import javax.swing.JPanel;

public class FractalsPanel extends JPanel {
    private FractalPainter fractal;

    public void setFractal(FractalPainter fractal) {
        this.fractal = fractal;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (fractal != null) {
            int width = getWidth();
            int height = getHeight();
            fractal.draw(g, width, height, FractalPainter.FILL);
        }
    }
}
