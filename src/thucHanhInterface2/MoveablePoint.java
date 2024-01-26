package thucHanhInterface2;

public class MoveablePoint implements Movable{
    private int x,y;

    public MoveablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveUp() {
        y++;
    }
    public String toString() {
        return "Point at (" + x + "," + y + ")";
    }
}
