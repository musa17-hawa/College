import javax.swing.JPanel;
import java.awt.Graphics;

public class FractalsPanel extends JPanel {
    private FractalPainter fractal;
    private int fillType;

    public FractalsPanel(int n) {
        setFillType(n);
    }
    
    public void setFractal(FractalPainter fractal) {
        this.fractal = fractal;
    }
    
    public void setFillType(int n) {
        // Set the fill type based on the input parameter
        this.fillType = n == 2 ? FractalPainter.FILL : FractalPainter.EMPTY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Translate the graphics context to the bottom-left corner
        int height = getHeight();
        g.translate(0, height);

        // Call the draw method of the fractal with the flipped graphics context
        if (fractal != null) {
            fractal.draw(g, getWidth(), -height, this.fillType);
        }
    }
}
