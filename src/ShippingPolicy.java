public interface ShippingPolicy {
    public int computeShiping(int weight, int distance);
    public String getPolicyName();
    public void setShipment(int weight, int distance);
}
