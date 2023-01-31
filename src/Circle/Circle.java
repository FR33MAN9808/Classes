package Circle;
import java.lang.Math;

public class Circle {
    public double diameter;
    public double radius;

    public Circle(double diameter, double radius){
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getParameter(){
        return Math.PI * this.diameter;
    }

    public double getArea(){
        return Math.PI * this.radius * this. radius;
    }
}


