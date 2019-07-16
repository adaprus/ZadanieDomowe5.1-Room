public class RoomTest {
    public static void main(String[] args) {
        Room room = new Room(18, 23, true);

        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
        room.temperatureDown1();
        System.out.println("Temperatura wynosi obecnie: " + room.getTemperature() + "*C");
    }
}
