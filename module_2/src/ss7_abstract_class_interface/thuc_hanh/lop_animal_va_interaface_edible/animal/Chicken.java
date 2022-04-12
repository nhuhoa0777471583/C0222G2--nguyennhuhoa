package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.animal;

public class Bai1Chicken extends Bai1Animal implements Bai1Eat {
    public String makeSound(){
        return "Gà: ò ó o";
    }
    public String howToEat(){
        return "could be ate";
    }
}
