import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for(Car car : fleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        String carText = "";
        for(Car car: fleet) {
            carText += car.toString() + " \n";
        }
        return carText;
    }


}
