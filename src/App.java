import Circle.Circle;
import Cylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {
        Circle newCircle = new Circle(20, 10);
        System.out.println("Area of the circle:" + newCircle.getArea());
        System.out.println("Parameter of the circle:" + newCircle.getParameter());

        Cylinder newCylinder = new Cylinder(20, 10);
        System.out.println("Volume of the circle:" + newCylinder.getVolume());
    }
}
