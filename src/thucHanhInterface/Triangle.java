package thucHanhInterface;

public class Triangle extends Shape{
    private int base,height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return ("Tam giac co màu " + getColor() + ", đáy = " + base + ", chiều cao = " + height);
    }
    public double area(){
        return (double) (base * height) /2;
    }
}
