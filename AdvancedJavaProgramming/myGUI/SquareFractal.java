import java.awt.Color;
import java.awt.Graphics;

public class SquareFractal extends FractalPainter {
    private int length;

    public SquareFractal(int length, int resolution) {
        super(resolution);
        this.length = length;
    }

    @Override
    public void draw(Graphics g, int width, int height, int fillType) {
        // Set the color of the graphics object to black
        g.setColor(Color.BLACK);
        
        // Call the recursive method to draw the square fractal
        drawSquareFractal(g, width / 2, height / 2, length, getResolution(), fillType);
    }

    private void drawSquareFractal(Graphics g, int x, int y, int sideLength, int resolution, int fillType) {
        // Base case: if the side length is less than the desired resolution, stop recursion
        if (sideLength < resolution) {
            return;
        }

        // Calculate the half length of the current square and the top-left coordinates
        int halfLength = sideLength / 2;
        int xTopLeft = x - halfLength;
        int yTopLeft = y - halfLength;

        // Determine the type of fill to be applied based on the fillType parameter
        if (fillType == FILL) {
            // Fill the square with a solid color
            g.fillRect(xTopLeft, yTopLeft, sideLength, sideLength);
        } else if (fillType == EMPTY) {
            // Draw an empty square outline
            g.drawRect(xTopLeft, yTopLeft, sideLength, sideLength);
        }

        // Recursively call the drawSquareFractal method to draw the smaller squares
        // Each recursive call is made for a different position relative to the current square
        drawSquareFractal(g, x - (halfLength + halfLength/2), y, halfLength, resolution, fillType); // Left square
        drawSquareFractal(g, x + (halfLength + halfLength/2), y, halfLength, resolution, fillType); // Right square
        drawSquareFractal(g, x, y - (halfLength + halfLength/2), halfLength, resolution, fillType); // Top square
        drawSquareFractal(g, x, y + (halfLength + halfLength/2), halfLength, resolution, fillType); // Bottom square
    }
}
