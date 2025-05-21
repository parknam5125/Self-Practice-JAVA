public class RoomOccupancy {
    private int roomNumber;
    private int peopleInRoom;
    static int totalNumber;

    public RoomOccupancy(int roomNumber, int peopleInRoom){
        this.roomNumber=roomNumber;
        this.peopleInRoom=peopleInRoom;
        totalNumber+=peopleInRoom;
    }

    public void addOneToRoom(){
        peopleInRoom++;
        totalNumber++;
    }

    public void removeOneFromRoom(){
        if((totalNumber>0)&&(peopleInRoom)>0){
            peopleInRoom--;
            totalNumber--;
        }
    }

    public int getPeopleInRoom(){
        return peopleInRoom;
    }

    public int getNumber(){
        return roomNumber;
    }

    public static int getTotal(){
        return totalNumber;
    }
}
