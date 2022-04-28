package ss21_design_patterns.bai_tap.MemoryPool;

public class BulletPool extends MemoryPool<Bullet>{
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
