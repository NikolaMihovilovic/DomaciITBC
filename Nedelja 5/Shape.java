package Sreda;

public abstract class Shape {
    private String name;

    /*Constructor*/

    public Shape(String name) {
        this.name = name;
    }

    /*Methods*/
    public abstract double circumference();

    public abstract double area();

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {
         String rez = "Shape: " + name + "\n" + "Circumference: " + circumference() + "\n" + "Area: " + area()+"\n";
         rez = rez.concat("---------------------");
         return rez;


    }


}
