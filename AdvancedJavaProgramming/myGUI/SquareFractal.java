import java.awt.Graphics;

public class SquareFractal extends FractalPainter {
    private int length;

    public SquareFractal(int length, int res) {
        super(res);
        this.length = length;
    }

    @Override
    public void draw(Graphics g, int w, int h, int fillType) {
        drawSquareFractal(g, w / 2 - length / 2, h / 2 - length / 2, length, getResolution(), fillType);
    }

    private void drawSquareFractal(Graphics g, int x, int y, int sideLength, int resolution, int fillType) {
        if (resolution >= MIN_RES) {
            if (fillType == FILL) {
                g.fillRect(x, y, sideLength, sideLength);
            } else {
                g.drawRect(x, y, sideLength, sideLength);
            }
            int newLength = sideLength / 2;
            drawSquareFractal(g, x - newLength, y - newLength, newLength, resolution - 1, fillType);
            drawSquareFractal(g, x + sideLength, y - newLength, newLength, resolution - 1, fillType);
            drawSquareFractal(g, x - newLength, y + sideLength, newLength, resolution - 1, fillType);
            drawSquareFractal(g, x + sideLength, y + sideLength, newLength, resolution - 1, fillType);
        }
    }
}