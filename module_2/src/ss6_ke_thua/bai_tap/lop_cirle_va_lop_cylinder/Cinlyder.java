package ss6_ke_thua.bai_tap.lop_cirle_va_lop_cylinder;

public class Cinlyder extends Circle {
    private double height;

    public Cinlyder(){}

    public Cinlyder(double height,double r,String color){
        super(r,color);
        this.height =height;
    }
    public double theTich(){
        return height *getR()*getR()*Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh tru " +
                "chieu cao=" + height + super.toString();
    }
    //test class Cilynder
    public static void main(String[] args) {

        Cinlyder cinlyder=new Cinlyder(5,3,"black");

        System.out.println(cinlyder);
        System.out.println("the tich= "+ cinlyder.theTich());
    }
}
