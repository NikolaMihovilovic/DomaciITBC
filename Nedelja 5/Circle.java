package Sreda;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    /*Constructor*/

    /*Methods*/
    //Todo:

    @Override
    public double circumference() {
        double obim = 2 * r * Math.PI;
        return obim;
    }

    @Override
    public double area() {
        double povrsina = r * r * Math.PI;
        return povrsina;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
