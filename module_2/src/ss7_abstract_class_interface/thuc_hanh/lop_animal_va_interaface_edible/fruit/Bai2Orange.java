package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.fruit;

import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.animal.Eat;

public class Bai2Orange extends Bai2Fruit implements Eat {
    public String color(){
        return "mau cam";
    }
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
