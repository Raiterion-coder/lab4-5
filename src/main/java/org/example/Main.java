import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(circle);
        System.out.println(rectangle);
        Cylinder cylinder = new Cylinder(circle, 10);
        System.out.println(cylinder);
    }
}