package Sreda;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }


    /*Methods*/

    @Override
    public double area() {
        double povrsina = a*b;
        return povrsina;
    }

    @Override
    public double circumference() {
        double obim = (a*2)+(b*2);
        return obim;
    }

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {
        return super.toString();
    }
}
