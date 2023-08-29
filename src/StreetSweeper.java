public class StreetSweeper extends Car {
    public StreetSweeper(String brand, String model, String color, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, "Street Sweeper", 6, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Street sweeper is moving");
    }

    @Override
    public void service() {
        System.out.println("Street sweeper is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the street sweeper");
    }
}

