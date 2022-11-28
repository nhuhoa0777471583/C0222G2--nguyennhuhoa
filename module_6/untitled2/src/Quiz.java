import java.io.IOException;

public class Quiz {
    public static void main(String[] args) {

    }
}

class Supper {
   private void foo() {
        System.out.println("cha");
    }
}

class Child extends Supper {
   public void foo() {
        System.out.println("con");
    }
}
