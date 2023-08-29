public class Main {
    public static void main(String[] args) {
        // Создание конкретных автомобилей
        GasolineCar gasolineCar = new GasolineCar("Toyota", "Corolla", "Blue", "Automatic", 1.8);
        DieselCar dieselCar = new DieselCar("Volkswagen", "Passat", "Black", "Manual", 2.0);

        // Вызов методов для бензинового автомобиля
        gasolineCar.move();
        gasolineCar.shiftGears();
        gasolineCar.refuelGasoline();
        gasolineCar.cleanWindshield();

        // Вызов методов для дизельного автомобиля
        dieselCar.move();
        dieselCar.service();
        dieselCar.shiftGears();
        dieselCar.refuelDiesel();
        dieselCar.cleanHeadlights();

        // Создание и использование фургона (ThreeWheeler)
        ThreeWheeler van = new ThreeWheeler("Ford", "Transit", "White", "Gasoline", "Manual", 2.2);
        van.move();
        van.service();
        van.shiftGears();
        van.refuelGasoline();

        // Создание и использование летающего автомобиля (FlyingCar)
        FlyingCar flyingCar = new FlyingCar("FutureFly", "SkyLiner", "Silver", "Gasoline", "Automatic", 3.0);
        flyingCar.fly();
        flyingCar.service();
        flyingCar.shiftGears();

        // Создание и использование станции заправки
        GasolineCar carForRefuel = new GasolineCar("Honda", "Civic", "Red", "Manual", 1.5);
        FuelStation fuelStation = carForRefuel;  // Используем полиморфизм

        fuelStation.refuel("Gasoline");
        fuelStation.cleanWindshield();
        fuelStation.cleanHeadlights();
        fuelStation.cleanMirrors();
    }
}
