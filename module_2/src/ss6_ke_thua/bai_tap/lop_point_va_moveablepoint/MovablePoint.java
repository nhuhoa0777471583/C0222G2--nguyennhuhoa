package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[]arr=new float[2];
        arr[1]=xSpeed;
        arr[2]=ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint: " +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +super.toString();
    }
    public MovablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(4,6);
        System.out.println(movablePoint);

        movablePoint=new MovablePoint(8,9);
        System.out.println(movablePoint.move());


    }

}
