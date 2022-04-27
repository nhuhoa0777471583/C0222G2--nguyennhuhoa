package ss21_design_patterns.thuc_hanh.FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal= new FactoryAnimal();

        Animal animal1 = factoryAnimal.getAnimal("feline");
        System.out.println("animal1 soud: "+ animal1.makeSound());

        Animal animal2 =factoryAnimal.getAnimal("canine");
        System.out.println("animal2 soud: "+ animal2.makeSound());
    }
}
