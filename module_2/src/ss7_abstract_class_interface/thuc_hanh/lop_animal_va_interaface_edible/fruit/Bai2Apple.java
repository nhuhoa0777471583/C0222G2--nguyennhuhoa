package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible;

public class Bai2Apple extends Bai2Fruit implements Bai1Eat {
    public String color(){
        return "màu đỏ!!";
    }

    @Override
    public String howToEat() {
        return "apple could be eat";
    }
}
