package ss21_design_patterns.bai_tap.MemoryPool;

public class Main {
    public static void main(String[] args) {
        Gun gun =new Gun();
        System.out.println("Start");
//        gun.fire();
        gun.fireInPool();
        System.out.println("game over");
        System.out.println("Tocal bullet created: " +Bullet.count);
    }
}
