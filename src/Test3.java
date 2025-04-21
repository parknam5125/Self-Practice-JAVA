public class Test3 {
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
            //OUTPUT: 2 -> 선언순서 반환
            System.out.println(state.equals(State.Colorado));
            //OUTPUT: false -> Colorado랑 다름
            System.out.println(state.compareTo(State.Colorado));
            //OUTPUT: 2 -> MN(2)-CO(0)
            System.out.println(state.valueOf("Colorado"));
            //OUTPUT: 0 -> Colorado의 선언순서
            System.out.println(state.valueOf(state.toString()));
            //OUTPUT: 2 -> Minnesota의 선언순서
            System.out.println(state.getAcronym());
            //OUTPUT: MN -> MN is Constructor
            System.out.println(state.toString());
            //OUTPUT: Minnesota
        }
}
