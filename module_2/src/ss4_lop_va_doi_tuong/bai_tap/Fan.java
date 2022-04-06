package ss4_lop_va_doi_tuong.bai_tap;

public class Fan {
    public static final byte slow = 1;
    public static final byte medium = 2;
    public static final byte fast = 3;
    public int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, double radius, String color) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.status) {
            return "Fan is on: " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        } else {
            return "Fan is off :  " +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        }
    }
}

class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, 10, "red");
        fan1.setStatus(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan(1, 10, "blue");
        fan2.setStatus(false);
        System.out.println(fan2.toString());

        Fan fan3 = new Fan(2, 5, "yellow");
        fan3.setStatus(true);
        System.out.print(fan3.toString());
    }
}
