import org.w3c.dom.css.Rect;

public class Final_11_Interface {
    public interface Measureable {
        public static final int IPF = 12;
        public double getPerimeter();
        public double getArea();
    }
    public static class Rectangle implements Measureable{
        private double width;
        private double height;

        public Rectangle(double w, double h){
            width=w;
            height=h;
        }
        public double getPerimeter(){
            return 2*(width+height);
        }
        public double getArea(){
            return width*height;
        }
    }
    public static class Circle implements Measureable {
        private double radius;
        
        public Circle(double r){
            radius = r;
        }
        public double getPerimeter(){
            return Math.PI*radius*radius;
        }
        public double getArea(){
            return 2*radius*Math.PI;
        }
    }
    public static void main(String[] args) {
        Measureable r = new Rectangle(10, 5);
        Measureable c = new Circle(3);

        System.out.println("Rectangle");
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());

        System.out.println("\nCircle");
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}
