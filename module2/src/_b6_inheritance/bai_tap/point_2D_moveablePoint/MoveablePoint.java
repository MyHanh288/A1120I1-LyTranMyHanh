package _b6_inheritance.bai_tap.point_2D_moveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y) {
        super(x, y);
    }

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

    public float[] getSpeed(){
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + getX() + ", y=" + getY() + ",xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    public MoveablePoint move() {
        float newX = super.getX() + this.xSpeed;
        float newY = super.getY() + this.ySpeed;
        super.setX(newX);
        super.setY(newY);
        return this;
    }
}
