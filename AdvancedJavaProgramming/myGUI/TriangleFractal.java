import java.awt.Color;
import java.awt.Graphics;

public class TriangleFractal extends FractalPainter {
    private int length;

    public TriangleFractal(int length, int resolution) {
        super(resolution);
        this.length = length;
    }

    @Override
    public void draw(Graphics g, int width, int height, int fillType) {
        // Set the color of the graphics object to black
        g.setColor(Color.BLACK);
        
        // Call the recursive method to draw the triangle fractal
        drawTriangleFractal(g, width / 2, height / 2, length, getResolution());
    }

    private void drawTriangleFractal(Graphics g, int x, int y, int sideLength, int resolution) {
        // Base case: if the side length is less than the desired resolution, stop recursion
        if (sideLength < resolution) {
            return;
        }

        // Calculate the half length of the current triangle and the coordinates of its vertices
        int halfLength = sideLength / 2;
        int xTop = x;
        int yTop = y - halfLength;
        int xLeft = x - halfLength;
        int yLeft = y + halfLength;
        int xRight = x + halfLength;
        int yRight = y + halfLength;

        // Draw the main triangle using the coordinates of its vertices
        g.drawPolygon(new int[]{xTop, xLeft, xRight}, new int[]{yTop, yLeft, yRight}, 3);

        // Recursively call the drawTriangleFractal method to draw the three smaller triangles inside
        // Each recursive call is made for a different position relative to the current triangle
        drawTriangleFractal(g, x + (halfLength / 2), y + (halfLength / 2), halfLength, resolution); // Top triangle
        drawTriangleFractal(g, x, y - (halfLength / 2), halfLength, resolution); // Left triangle
        drawTriangleFractal(g, x - (halfLength / 2), y + (halfLength / 2), halfLength, resolution); // Right triangle
    }
}
