import java.awt.Graphics;

public abstract class FractalPainter {
    // Minimum resolution value for the fractal
    public static final int MIN_RES = 2;

    // Constants representing fill types
    public static final int EMPTY = 1, FILL = 2;

    // Resolution of the fractal
    private int resolution;

    // Constructor for the FractalPainter class
    public FractalPainter(int resolution) {
        // Set the resolution of the fractal
        setResolution(resolution);
    }

    // Set the resolution of the fractal
    public void setResolution(int resolution) {
        // Ensure the resolution is not below the minimum value
        this.resolution = (resolution < MIN_RES) ? MIN_RES : resolution;
    }

    // Get the resolution of the fractal
    public int getResolution() {
        return resolution;
    }

    // Abstract method to be implemented by subclasses for drawing the fractal
    public abstract void draw(Graphics g, int w, int h, int fillType);
}
