package shape;

public class Main {
    public static void main(String[] args) {
        Circle sh1 = new Circle(5);
        System.out.println("Circle Area: " + sh1.getArea());
        System.out.println("Circle Perimeter: " + sh1.getPerimeter());
        Rectangle r1 =new Rectangle(10,20);
        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Rectangle Perimeter: " + r1.getPerimeter());
    }
}