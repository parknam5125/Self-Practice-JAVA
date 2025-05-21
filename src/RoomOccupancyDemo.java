public class RoomOccupancyDemo {
    public static void main(String[] args) {
        RoomOccupancy r = new RoomOccupancy(101, 2);
        RoomOccupancy s = new RoomOccupancy(102, 3);
        System.out.println(RoomOccupancy.getTotal());

        r.addOneToRoom();
        r.addOneToRoom();
        s.removeOneFromRoom();

        System.out.println(r.getPeopleInRoom());
        System.out.println(s.getPeopleInRoom());
        System.out.println(RoomOccupancy.getTotal());
    }
}
