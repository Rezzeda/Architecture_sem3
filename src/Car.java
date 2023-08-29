public abstract class Car implements FuelStation, GasolineVehicle, DieselVehicle {
    // Свойства
    protected String brand;
    protected String model;
    protected String color;
    protected String bodyType;
    protected int numberOfWheels;
    protected String fuelType;
    protected String transmissionType;
    protected double engineVolume;

    // Конструктор
    public Car(String brand, String model, String color, String bodyType, int numberOfWheels,
               String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    public Car(String brand, String model, String color, String gasoline, String transmissionType, double engineVolume) {
    }

    // Методы
    public abstract void move();

    public abstract void service();

    public abstract void shiftGears();

    public void turnOnHeadlights() {
        System.out.println("Headlights turned on");
    }

    public void turnOnWipers() {
        System.out.println("Wipers turned on");
    }

    public void sweepStreet() {
        System.out.println("Sweeping the street");
    }

    public void turnOnFogLights() {
        System.out.println("Fog lights turned on");
    }

    public void transportCargo() {
        System.out.println("Transporting cargo");
    }


    @Override
    public void refuel(String fuelType) {
        System.out.println("Refueling with " + fuelType);
    }

    @Override
    public void cleanWindshield() {
        System.out.println("Cleaning windshield");
    }

    @Override
    public void cleanHeadlights() {
        System.out.println("Cleaning headlights");
    }

    @Override
    public void cleanMirrors() {
        System.out.println("Cleaning mirrors");
    }

    @Override
    public void refuelGasoline() {
        refuel("Gasoline");
    }

    @Override
    public void refuelDiesel() {
        refuel("Diesel");
    }
}

