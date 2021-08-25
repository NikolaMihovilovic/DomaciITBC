package Sreda;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*Constructor*/

    /*Methods*/
    //Todo:

    @Override
    public double circumference() {
        double obim = a + b + c;
        return obim;
    }

    @Override
    public double area() {
        double s = (a+b+c)/2;
        double povrsina = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return povrsina;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
