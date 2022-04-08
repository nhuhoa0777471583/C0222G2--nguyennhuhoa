package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

import java.util.Arrays;

public class Point2D {
    public float x=5f;
    public float y=2f;
    public Point2D(){}

    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
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



    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[1] = this.x;
        arr[2] = this.y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D : " +
                "x=" + x +
                ", y=" + y+'\n'+"["+x+","+y+"]";
    }
    //Text class Point2d
    public static void main(String[] args) {
        Point2D point2D=new Point2D(1,5);
        System.out.println(point2D);


    }
}