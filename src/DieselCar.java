public class DieselCar extends Car {
    public DieselCar(String brand, String model, String color, String transmissionType, double engineVolume) {
        super(brand, model, color, "Diesel", transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Diesel car is moving");
    }

    @Override
    public void service() {
        System.out.println("Diesel car is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the diesel car");
    }

    @Override
    public void refuelDiesel() {
        refuel("Diesel");
    }
}