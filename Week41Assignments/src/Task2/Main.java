package Task2;

public class Main {
    public static void main(String[] args) {
        Room bathRoom = new Room(4,1,2,1);
        Room livingRoom = new Room(4,2,5,4);
        Room diningRoom = new Room(4,3,3,2);

        // Room collection
        Room[] rooms = new Room[3];
        rooms[0] = bathRoom;
        rooms[1] = livingRoom;
        rooms[2] = diningRoom;

        // Buildings
        Building building1 = new Building(rooms,3,2,false);

        System.out.println("There are " + building1.buildingLamps() + " lamps in the entire building.");

        if(building1.getNumberOfFloors() > building1.getRooms().length) {
            System.out.println("This building needs an architect.");
        } else {
            System.out.println("This building has its proportions straight.");
        }
    }
}
