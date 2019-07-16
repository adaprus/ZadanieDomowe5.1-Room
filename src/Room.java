public class Room {
    private double meters;
    private double temperature;
    private boolean airConditioner;

    public Room() {
    }

    public Room(double meters, double temperature, boolean airConditioner) {
        this.meters = meters;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean temperatureDown1(){
        double temperatureLowLimit = 18;
        if(airConditioner && temperature > temperatureLowLimit){
            temperature--;
            return true;
        } else {
            return false;
        }
    }
}
