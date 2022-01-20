import processing.core.PApplet;

public class tryProcessing extends PApplet{

    public static final int Width = 640;
    public static final int Height = 480;

    public static void main(String args[]){
        PApplet.main("tryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(Width, Height);
    }

    public Ball createBall(int yPos){
        int width = 10, height = 10, xPos = 0;
        Ball newBall = new Ball(width, height, xPos, yPos);
        return newBall;
    }

    Ball ball1 = createBall(Height/5);
    Ball ball2 = createBall(2 * (Height/5));
    Ball ball3 = createBall(3 * (Height/5));
    Ball ball4 = createBall(4 * (Height/5));

    public void createCircle(Ball ball){
        ellipse(ball.ball_xPos, ball.ball_yPos, ball.ball_width, ball.ball_height);
    }

    @Override
    public void draw() {

        createCircle(ball1);
        ball1.ball_xPos += 1;

        createCircle(ball2);
        ball2.ball_xPos += 2;

        createCircle(ball3);
        ball3.ball_xPos += 3;

        createCircle(ball4);
        ball4.ball_xPos += 4;

    }
}


