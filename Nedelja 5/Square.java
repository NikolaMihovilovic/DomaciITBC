package Sreda;

public class Square extends Shape {
    private double a;
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }
    /*Constructor*/



    /*Methods*/
    //TODO


    @Override
    public double circumference() {
        double obim = a * 4;
        return obim;
    }

    @Override
    public double area() {
        double povrsina = a * a;
        return povrsina;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
