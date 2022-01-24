package inhertance.thuc_hanh.bai_tap.poid_and_moveablepoid;

public class MoveablePoid extends Poid{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoid() {

    }

    public MoveablePoid(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoid(float x, float y, float xSpeed, float ySpeed) {
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

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed() {
        float [] arr = new float[2];
        return new float[]{
                arr[0] = xSpeed,
                arr[1] = ySpeed
        };
    }

    @Override
    public String toString() {
        return "MoveablePoid : " +
                "xSpeed = " + xSpeed +
                ", ySpeed= " + ySpeed + ", Array of [" + xSpeed + ", " + ySpeed + "], Speed = (" + getX() * xSpeed + ", " + getY() * ySpeed + ").";
    }

    public MoveablePoid move() {
        setX(super.getX() + xSpeed);
        setY(super.getY() + ySpeed);
        return this;
    }
}
