package tema6;

interface IMovable2D {
    public static final int MAX_X = 1000;
    public static final int MAX_Y = 1000;
    public void move(int x, int y);
    public boolean stucked();
}
