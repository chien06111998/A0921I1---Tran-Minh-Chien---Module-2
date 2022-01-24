package inhertance.thuc_hanh.bai_tap.poid_and_moveablepoid;

public class Poid {
    private float x = 0.0f;
    private float y = 0.0f;

    public Poid() {
    }

    public Poid(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float [] getXY () {
        float [] arr = new float[2];
        return new float[] {
                arr[0] = x,
                arr[1] = y
        };
    }

    @Override
    public String toString() {
        return "Poid : " +
                "x = " + x +
                ", y = " + y +", Array of = [" + x + ", " + y + "].";
    }
}
