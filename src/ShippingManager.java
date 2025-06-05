public class ShippingManager {
    private ShippingPolicy[] policies = new ShippingPolicy[10];
    private int policyCount = 0;
    private int weight;
    private int distance;

    public void setShipment(int weight, int distance){
        this.weight = weight;
        this.distance = distance;
    }

    public void addPolicy(ShippingPolicy policy){
        policies[policyCount++] = policy;
        if(policyCount==10){
            System.exit(0);
        }
    }

    public void applyAllPolicies(){
        System.out.println("== Shipping Cost Summary ===");
        for (int i = 0; i < policyCount; i++) {
            ShippingPolicy policy = policies[i];
            policy.setShipment(weight, distance);
            int cost = policy.computeShiping(weight, distance);
            if(policy.getPolicyName().equals("TieredWeightShippingPolicy")){
                System.out.println(policy.getPolicyName() + " : " + cost);
            }
            else{
                System.out.println("TieredWeightShippingPolicy + " + policy.getPolicyName() + " : " + cost);
            }
        }
    }

    public void sortPoliciesByCost(){
        ShippingPolicy[] sortedPolicies = new ShippingPolicy[policyCount];
        for (int i = 0; i < policyCount; i++){
            sortedPolicies[i] = policies[i];
        }
        for (int i = 0; i < policyCount - 1; i++) {
            for (int j = i + 1; j < policyCount; j++) {
                if (sortedPolicies[i].computeShiping(weight, distance) > sortedPolicies[j].computeShiping(weight, distance)) {
                    ShippingPolicy temp = sortedPolicies[i];
                    sortedPolicies[i] = sortedPolicies[j];
                    sortedPolicies[j] = temp;
                }
            }
        }
        System.out.println("=== Sorted by Cost ===");
        for (ShippingPolicy policy : sortedPolicies) {
            System.out.println(policy.getPolicyName() + ": " + policy.computeShiping(weight, distance));
        }
        if(sortedPolicies[0].getPolicyName().equals("TieredWeightShippingPolicy")){
            System.out.println("Best Option: " + sortedPolicies[0].getPolicyName() + " - " + sortedPolicies[0].computeShiping(weight, distance));
        }
        else{
            System.out.println("TieredWeightShippingPolicy + " + sortedPolicies[0].getPolicyName() + " : " + policy.computeShiping(weight, distance));
        }
        System.out.println("Best Option: " + sortedPolicies[0].getPolicyName() + " - " + sortedPolicies[0].computeShiping(weight, distance));
    }
}
