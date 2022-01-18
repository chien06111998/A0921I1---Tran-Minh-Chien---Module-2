package inhertance.thuc_hanh.bai_tap.poid2d_and_poid3d;

public class Poid3D extends Poid2D{
    private float z = 0.0f;



    public Poid3D(float z) {
        this.z = z;
    }

    public Poid3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getXYZ() {
        return "[" + x + ", " + y + ", " + z + "]";
    }

    @Override
    public String toString() {
        return "Poid3D : z = " + z + ", Array of = " + getXYZ();
    }
}
