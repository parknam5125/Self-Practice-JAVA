public abstract class AbstractShippingPolicy implements ShippingPolicy{
    private int weight;
    private int distance;

    public void setShipment(int weight, int distance){
        this.weight = weight;
        this.distance = distance;
    }
    public abstract String getPolicyName();
}
