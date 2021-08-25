package Sreda;

public class Square extends Shape {
    private double a;
    public Square(String name, int i, int a) {
        super(name);
        this.i = i;
        this.a = a;
    }
    /*Constructor*/



    /*Methods*/
    //TODO


    @Override
    public double circumference() {
        double obim = (2 * a) + (2 * i);;
        return obim;
    }

    @Override
    public double area() {
        double povrsina = a * i;
        return povrsina;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
