package tinhDaHinh;

public abstract class Shape {
    private String color;
    private boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
