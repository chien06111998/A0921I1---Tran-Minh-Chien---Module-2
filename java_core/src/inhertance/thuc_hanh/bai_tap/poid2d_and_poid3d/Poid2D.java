package inhertance.thuc_hanh.bai_tap.poid2d_and_poid3d;

public class Poid2D {
    float x = 0.0f;
    float y = 0.0f;

    public Poid2D() {
    }

    public Poid2D(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String getXY() {
        return "[" + x + ", " + y +"]";
    }

    @Override
    public String toString() {
        return "Poid2D : x = " + x + ", y = " + y + ", Array of = " + getXY();
    }
}
