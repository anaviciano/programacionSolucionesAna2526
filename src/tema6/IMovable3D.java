package tema6;

interface IMovable3D extends IMovable2D{
    public static final int MAX_Z = 1000;
    public static final int z = 0;
    public void move(int x,int y,int z);
}
