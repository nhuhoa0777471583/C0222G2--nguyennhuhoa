package ss5_access_modifier_static_method_static_property.thuc_hanh;

public class StaticPropertyCar {
    private String name;
    private String engine;

    public static int numberOfCar;

    public StaticPropertyCar(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public static void setNumberOfCar(int numberOfCar) {
        StaticPropertyCar.numberOfCar = numberOfCar;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }
    void display(){
        System.out.println( name + " " + engine + " ");
    }
}

class TextStaticPropertyCar {
    public static void main(String[] args) {
        StaticPropertyCar car1 = new StaticPropertyCar("Mazda 3", "Skyactiv 3");
        System.out.print(StaticPropertyCar.numberOfCar);
        car1.display();

        StaticPropertyCar car2=new StaticPropertyCar("Mazda 6", "Skyactiv 6");
        System.out.print(StaticPropertyCar.numberOfCar);
        car2.display();
    }
}