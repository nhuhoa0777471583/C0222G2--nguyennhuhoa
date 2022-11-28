public class Base {
    public Base (){
        System.out.println("AAAA");
    }

}

class Der extends Base{
    public Der(){
        System.out.println("Der");
    }
}

class De extends Der{
    public De(){
        System.out.println("de");
    }
}
class Test{
    public static void main(String[] args) {
        Der b = new De();
    }
}
