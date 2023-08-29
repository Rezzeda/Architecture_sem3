
public class SUV extends Car {
    public SUV(String brand, String model, String color, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, "SUV", 4, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("SUV is moving");
    }

    @Override
    public void service() {
        System.out.println("SUV is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the SUV");
    }
}
