public class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println();
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + " Thread name: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.run();

        //Tạo ra luồng t2 từ class ThreadTest
        ThreadTest t2 = new ThreadTest();
        t2.start();
//
//        //Tạo ra luồng t3 từ class ThreadTest
//        ThreadTest t3 = new ThreadTest();
//        t3.start();
    }
}
