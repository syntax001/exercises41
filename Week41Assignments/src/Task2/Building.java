package Task2;

public class Building {
    private final Room[] rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }

    public int buildingLamps() {
        int totalLamps;
        totalLamps = rooms[0].getNumberOfLamps() + rooms[1].getNumberOfLamps() + rooms[2].getNumberOfLamps();
        return totalLamps;
    }
}
