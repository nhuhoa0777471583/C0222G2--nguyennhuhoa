package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.fruit;

import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.fruit.Bai2Apple;
import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.fruit.Bai2Fruit;
import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.fruit.Bai2Orange;

public class Bai2Text {
    public static void main(String[] args) {
        Bai2Fruit[] fruits =new Bai2Fruit[2];
        fruits[0]=new Bai2Apple();
        fruits[1]=new Bai2Orange();
        for (Bai2Fruit fruit:fruits) {
            System.out.println(fruit.color());
            if (fruit instanceof Bai2Fruit) {
                System.out.println(fruit.howToEat());
            }
        }
    }

}
