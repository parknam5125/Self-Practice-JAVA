public class DistanceMultiplierPolicy extends AbstractShippingPolicy{
    private String name;
    public DistanceMultiplierPolicy(){
        name = "DistanceMultiplierPolicy";
    }
    public int computeShiping(int weight, int distance){
        double cost;
        TieredWeightShippingPolicy a = new TieredWeightShippingPolicy();
        int original = a.computeShiping(weight, distance);
        if((distance >= 0) && (distance <= 20)){
            cost = original;
        }
        else if((distance > 20) && (distance <= 100)){
            cost = (double)original * 1.5;
        }
        else if(distance > 100){
            cost = original * 2;
        }
            
    public String getPolicyName(){
        return name;
    }
}
