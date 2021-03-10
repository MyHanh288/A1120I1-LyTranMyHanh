package _b6_inheritance.bai_tap.point_2D_point_3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {getX(),getY(), this.z};
        return arr;
    }

    public void setXYZ(float x, float y, float z){
        getX();
        getY();
        getZ();
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + ", y=" + getY() + ", z=" + z + '}';
    }
}
