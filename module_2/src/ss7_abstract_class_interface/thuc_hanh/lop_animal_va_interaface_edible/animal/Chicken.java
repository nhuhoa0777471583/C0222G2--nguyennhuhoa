package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.animal;

public class Chicken extends Animal implements Eat {
    public String makeSound(){
        return "Gà: ò ó o";
    }
    public String howToEat(){
        return "could be ate";
    }
}
