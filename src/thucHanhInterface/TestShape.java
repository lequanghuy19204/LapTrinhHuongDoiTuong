package thucHanhInterface;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Triangle("Red", 4, 3);
        Shape s2 = new Rectangle("Red", 4, 3);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
