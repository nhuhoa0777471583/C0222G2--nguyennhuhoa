public class test {

    int x ;
    int y;
    void add(int a){
        x = a+ 1;
    }
    void add (int a, int b){
        x = a+ 2;
    }
}
class test2{
    public static void main(String[] args) {
        test t1 = new test();
        int a = 0;
        t1.add(6);
        System.out.println(t1.x);
    }
}
