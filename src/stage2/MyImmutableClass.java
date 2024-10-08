package stage2;

public final class MyImmutableClass {
    private final int x;
    private final int y;

    public MyImmutableClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point: (" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}