public class Circle implements Measureable{
    private double myRadius;

    public Circle(double Radius){
        myRadius = Radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*myRadius;
    }

    public double getCircumference(){
        return getPerimeter();
    }

    public double getArea(){
        return Math.PI*myRadius*myRadius;
    }
}
