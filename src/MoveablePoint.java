public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){

    };

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float [] move(){
        getXY()[0] += xSpeed;
        getXY()[1] += ySpeed;
        return getXY();
    }

    public String toString(){
        return "(" + getXY()[0] + " , " + getXY()[1] + ")"
                + ", speed = "
                + "(" + getxSpeed() + " , " + getySpeed()+")";
    }
}
