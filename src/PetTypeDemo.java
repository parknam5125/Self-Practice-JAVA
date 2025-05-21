
public class PetTypeDemo {
    public static void main(String[] args) {
        Pet p1 = new Pet("coco",2,PetType.Dog);
        Pet p2 = new Pet("bori",1,PetType.Dog);
        Pet p3 = new Pet("namu",3,PetType.Cat);

        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());

        System.out.println(p1.isSameType(p2));
        System.out.println(p1.isSameType(p3));
    }
    
}

