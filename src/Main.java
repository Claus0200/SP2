public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();


        fleetOfCars.addCar(new GasolineCar("Audi","A6","A2C B46",4,15));
        fleetOfCars.addCar(new DieselCar("Bmw", "W6", "CFK 6A8",4,12,true));
        fleetOfCars.addCar(new ElectricCar("Toyota", "bz4x", "SEE YA",2,64,400));

        System.out.println(fleetOfCars);
        System.out.println("Den totalte pris du skal betale: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr. ");
    }
}