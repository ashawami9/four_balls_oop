import processing.core.PApplet;

public class Sketch extends PApplet{

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private static final int DIAMETER = 10;
    private static final int INITIAL_STATE = 0;
    private static final int TOTAL_BALLS = 4;
    private static Ball[] balls;

    public static void main(String[] args) {
        PApplet.main("Sketch", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
        balls = new Ball[TOTAL_BALLS];
        for (int ball = 0; ball < TOTAL_BALLS; ball++) {
            balls[ball] = new Ball(this, INITIAL_STATE,(ball+1) * HEIGHT/5, DIAMETER);
        }
    }

    @Override
    public void draw() {
        for (int ball = 0; ball < TOTAL_BALLS; ball++){
            balls[ball].displayBall(ball + 1);
            balls[ball].updateState();
        }
    }
}

