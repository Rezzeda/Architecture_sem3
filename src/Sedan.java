public class Sedan extends Car {
    public Sedan(String brand, String model, String color, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, "Sedan", 4, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Sedan is moving");
    }

    @Override
    public void service() {
        System.out.println("Sedan is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the sedan");
    }
}