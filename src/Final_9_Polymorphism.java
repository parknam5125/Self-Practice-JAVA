public class Final_9_Polymorphism {
    public static void main(String[] args) {
        Animal a[] = new Animal[4];
        a[0] = new Cat();
        a[1] = new Dog();
        a[2] = new Duck();
        a[3] = new Cow();
        for(int i = 0; i < 4; i++){
            a[i].speak();
        }
    }
    public static class Animal {
        private String animalName;
        public void speak(){

        }
    }
    public static class Cat extends Animal{
        public void speak(){
            System.out.println("Mew");
        }
    }
    public static class Dog extends Animal{
        public void speak(){
            System.out.println("Woof");
        }
    }
    public static class Duck extends Animal{
        public void speak(){
            System.out.println("Quack");
        }
    }
    public static class Cow extends Animal{
        public void speak(){
            System.out.println("Moo");
        }
    }
}
