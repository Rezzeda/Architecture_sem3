public class FlyingCar extends Car {
    public FlyingCar(String brand, String model, String color, String fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, "Flying Car", 4, fuelType, transmissionType, engineVolume);
    }


    public void fly() {
        System.out.println(brand +": " + model+ " is flying");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void service() {
        System.out.println("Flying car " + brand +": " + model+ "is being serviced");
    }

    @Override
    public void shiftGears() {
        System.out.println("Shifting gears in the flying car: "+ brand +": " + model);
    }
}
