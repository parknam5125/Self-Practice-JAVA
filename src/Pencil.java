public class Pencil {
    String color = "White";
    int length;
    float diameter;
    float price;
    static long nextID=0;

    void setPrice(float newPrice){
        price=newPrice;
    }
    void printPrice(){
        System.out.println(price);
    }
}
