package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr2 = new float[3];
        arr2[0] = this.x;
        arr2[1] = this.y;
        arr2[2] = this.z;
        return arr2;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Point3D: " +
                "z=" + z + '\n' + "["+x+","+y+","+z+"]";

    }

    //Text class Point3D
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 4, 8);
        System.out.println(point3D);
    }
}