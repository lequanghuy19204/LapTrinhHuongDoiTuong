package thucHanhInterface;

public class Rectangle extends Shape{
    private int length,width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return ("Hình chữ nhật có mau " + getColor() + ", chiều dài = " + length + ", chiều rộng = " + width);
    }
    public double area(){
        return length*width;
    }
}
