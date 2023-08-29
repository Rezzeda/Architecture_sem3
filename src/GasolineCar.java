public class GasolineCar extends Car {
    public GasolineCar(String brand, String model, String color,
                       String transmissionType, double engineVolume) {
        super(brand, model, color, "Gasoline", transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Gasoline car is moving");
    }

    @Override
    public void service() {
        System.out.println("Gasoline car is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the gasoline car");
    }

    @Override
    public void refuelGasoline() {
        refuel("Gasoline");
    }
}
