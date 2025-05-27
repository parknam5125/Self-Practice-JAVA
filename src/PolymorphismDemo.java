public class PolymorphismDemo {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Undergraduate("park",4910,1);
        people[1] = new Undergraduate("nam",9931,2);
        people[2] = new Student("jin",8812);
        people[3] = new Undergraduate("pnj",9901,4);

        for(Person p : people){
            p.writeOutput();
            System.out.println();
        }
    }
}
