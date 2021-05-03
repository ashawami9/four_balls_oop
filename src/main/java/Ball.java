import processing.core.PApplet;

public class Ball {
    private PApplet sketch;
    private int xCoordinate;
    private int yCoordinate;
    private int diameter;

    public Ball(PApplet sketch, int xCoordinate, int yCoordinate, int diameter) {
        this.sketch = sketch;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.diameter = diameter;
    }

    public void updateState() {
        xCoordinate++;
    }

    public void displayBall(int speed) {
        sketch.ellipse(xCoordinate * speed, yCoordinate, diameter, diameter);
    }
}

