package ss21_design_patterns.bai_tap.MemoryPool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount= 1000;

    public void fireInPool(){

        BulletPool bulletPool =new BulletPool();
        List<Bullet> bulletList =new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p =bulletPool.newItem();
            p.setPosition(0);
            bulletList.add(p);
            for (int j = 0; j < bulletList.size(); j++) {
                Bullet pp= bulletList.get(j);
                pp.move();
                System.out.println("-"+pp.getPosition());
                if(pp.getPosition()==10){
                    bulletPool.freeItem(pp);
                    bulletList.remove(pp);
                }
            }
            System.out.println();
        }
    }
    public void fire(){
        List<Bullet> bullets =new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p= new Bullet();
            p.setPosition(0);
            bullets.add(p);
            for (int j = 0; j < bullets.size(); j++) {
                Bullet pp= bullets.get(j);
                pp.move();
                System.out.println("-"+ pp.getPosition());
                if(pp.getPosition()==10){
                    bullets.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
