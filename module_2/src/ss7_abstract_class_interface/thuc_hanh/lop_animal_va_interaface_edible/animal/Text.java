package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.animal;

public class Bai1Text {
    public static void main(String[] args) {
        Bai1Chicken chicken=new Bai1Chicken();
        System.out.println(chicken.makeSound());

        Bai1Tiger tiger=new Bai1Tiger();
        System.out.println(tiger.makeSound());

        
        Bai1Animal[] animals =new Bai1Animal[2];
        animals[0]=new Bai1Tiger();
        animals[1]=new Bai1Chicken();
        for (Bai1Animal animal:animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Bai1Chicken){
                Bai1Eat ate= (Bai1Chicken) animal;
                System.out.println(ate.howToEat());
            }
        }
    }
}
