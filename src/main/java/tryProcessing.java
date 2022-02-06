import processing.core.PApplet;

public class tryProcessing extends PApplet{

    public static final int Width = 640;
    public static final int Height = 480;

    Ball ball1 = new Ball(Height/5,1);
    Ball ball2 = new Ball(2 * (Height/5), 2);
    Ball ball3 = new Ball(3 * (Height/5), 3);
    Ball ball4 = new Ball(4 * (Height/5), 4);

    public static void main(String args[]){
        PApplet.main("tryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(Width, Height);
    }

    @Override
    public void draw() {

        displayBall(ball1);

        displayBall(ball2);

        displayBall(ball3);

        displayBall(ball4);

    }

    public void displayBall(Ball ball){
        ellipse(ball.getXPos(), ball.getYPos(), ball.BALL_RADIUS, ball.BALL_RADIUS);
        ball.moveBall();
    }
}


