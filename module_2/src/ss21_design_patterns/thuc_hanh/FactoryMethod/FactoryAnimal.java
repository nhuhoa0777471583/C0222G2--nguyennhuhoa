package ss21_design_patterns.thuc_hanh.FactoryMethod;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
