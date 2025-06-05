public class TieredWeightShippingPolicy extends AbstractShippingPolicy{
    private String name;

    public TieredWeightShippingPolicy(){
        name = "TieredWeightShippingPolicy";
    }
    public int computeShiping(int weight, int distance){
        double cost;
        if((weight <= 10) && (weight >= 0)){
            cost = 5000;
        }
        else if((weight > 10) && (weigt < 30)){
            int d = weight - 10;
            cost = 5000 + 300 * d;
        }
        else if(weight > 30){
            int a = weight - 30;
            cost = 10000 + 500 * a;
        }
        
        return cost;
    }
    public String getPolicyName(){
        return name;
    }
}
