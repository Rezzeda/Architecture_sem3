public class ThreeWheeler extends Car {
    public ThreeWheeler(String brand, String model, String color, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, "Three-Wheeler", 3, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Three-wheeler is moving");
    }

    @Override
    public void service() {
        System.out.println("Three-wheeler is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the three-wheeler");
    }
}
