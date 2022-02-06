public class Ball {

    public final int BALL_RADIUS;
    public final int SPEED;
    private int ballXPos;
    private int ballYPos;

    public Ball(int yPos, int speed){
        BALL_RADIUS = 10;
        ballXPos = 0;
        ballYPos = yPos;
        SPEED = speed;
    }

    public void moveBall(){
        this.ballXPos += this.SPEED;
    }

    public int getXPos(){
        return this.ballXPos;
    }

    public int getYPos(){
        return this.ballYPos;
    }

}
