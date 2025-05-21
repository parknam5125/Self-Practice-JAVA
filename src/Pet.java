public class Pet{
    

    private String name;
    private int age;
    private PetType type;

    public Pet(String name, int age, PetType type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public String getInfo(){
        return "이름: " + name + ", 나이: " + age + "살, 종류: " + type;
    }
    public boolean isSameType(Pet other){
        return this.type == other.type;
    }
}