import java.awt.Graphics;

public class TriangleFractal extends FractalPainter {
    private int length;

    public TriangleFractal(int length, int res) {
        super(res);
        this.length = length;
    }

    @Override
    public void draw(Graphics g, int w, int h, int fillType) {
        drawTriangleFractal(g, w / 2, h / 2 - length / 2, length, getResolution(), fillType);
    }

    private void drawTriangleFractal(Graphics g, int x, int y, int sideLength, int resolution, int fillType) {
        if (resolution >= MIN_RES) {
            if (fillType == FILL) {
                drawFilledTriangle(g, x, y, sideLength);
            } else {
                drawTriangle(g, x, y, sideLength);
            }
            int newLength = sideLength / 2;
            drawTriangleFractal(g, x - newLength, y, newLength, resolution - 1, fillType);
            drawTriangleFractal(g, x + newLength, y, newLength, resolution - 1, fillType);
            drawTriangleFractal(g, x, y + sideLength, newLength, resolution - 1, fillType);
        }
    }

    private void drawFilledTriangle(Graphics g, int x, int y, int sideLength) {
        int[] xPoints = {x, x - sideLength / 2, x + sideLength / 2};
        int[] yPoints = {y, y + sideLength, y + sideLength};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private void drawTriangle(Graphics g, int x, int y, int sideLength) {
        int[] xPoints = {x, x - sideLength / 2, x + sideLength / 2};
        int[] yPoints = {y, y + sideLength, y + sideLength};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
