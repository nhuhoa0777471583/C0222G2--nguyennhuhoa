package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interaface_edible.animal;

public class Text {
    public static void main(String[] args) {
        Chicken chicken=new Chicken();
        System.out.println(chicken.makeSound());

        Tiger tiger=new Tiger();
        System.out.println(tiger.makeSound());


        Animal[] animals =new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken){
                Eat ate= (Chicken) animal;
                System.out.println(ate.howToEat());
            }
        }
    }
}
