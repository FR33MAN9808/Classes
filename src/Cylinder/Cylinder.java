package Cylinder;
import java.lang.Math;

public class Cylinder {
    public double height;
    public double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double getVolume(){
        return Math.PI * this.radius * this. radius * this.height;
    }
}
