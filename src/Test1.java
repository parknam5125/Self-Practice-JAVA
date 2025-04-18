public class Test1 {
    public enum State{
        Colorado("CO"),
        Hawaii("HI"),
        Minnesota("MN"),
        Oregon("OR"),
        Washington("WA");

        String acronym;
        State(String acronym){
            this.acronym=acronym;
        }
        public String getAcronym(){
            return acronym;
        }
    }
        public static void main(String[] args) {
            State state = State.Minnesota;
            System.out.println(state.ordinal());
            System.out.println(state.equals(State.Colorado));
            System.out.println(state.compareTo(State.Colorado));
            System.out.println(state.valueOf("Colorado"));
            System.out.println(state.valueOf(state.toString()));
            System.out.println(state.getAcronym());
            System.out.println(state.toString());
        }
}
