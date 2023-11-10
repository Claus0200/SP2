public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("Audi","A6","A2C B46",4,15));
        fleetOfCars.addCar(new DieselCar("Mercedes", "S350", "CFK 6A8",4,17,true));
        fleetOfCars.addCar(new ElectricCar("Tesla", "Model 3", "DL3 J2Y",4,60,405));

        System.out.println(fleetOfCars);
        System.out.println("Den pris du skal betale er: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr. ");
    }
}