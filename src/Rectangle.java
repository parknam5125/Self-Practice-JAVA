public class Rectangle implements Measureable{
    private double myWidth;
    private double myHeight;

    public Rectangle(double width, double height){
        myWidth = width;
        myHeight = height;
    }

    public double getPerimeter(){
        return 2*(myHeight*myWidth);
    }

    public double getArea(){
        return myHeight*myWidth;
    }
}
