public class main {


            static public int X = 2;

            static {
                X = 1;
            }

            static public void method() {
                X = 5;
            }

            public static void main(String[] args) {
            main o = new main();
            main.method();
            main.X = 10;
                System.out.printf("x=%d, y=%d", o.X, main.X);


    }
}
