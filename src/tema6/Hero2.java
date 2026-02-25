package tema6;

public class Hero2 extends Entity implements IMovable2D
{
    int x; int y;
    public Hero2(String n, int h) {
        super(n);
        //this.name = n;
        this.health = h;
        this.damage = 10;

    }
    @Override
    public void move(int x, int y) {
        //this.x = x; this.y = y;
        if (x >= 0 && x <= IMovable2D.MAX_X &&
                y >= 0 && y <= IMovable2D.MAX_Y) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("¡Fuera de límites!");
        }
    }
    @Override
    public boolean stucked() {
        return false;
    }
}
