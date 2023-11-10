public abstract class AFuelCar extends ACar {
    int kmPrLitre;

    AFuelCar(String make, String model, String registrationNumber, int numberOfDoors,int kmPrLitre) {
        super(make,model,registrationNumber,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "km/l: " + kmPrLitre + ", fueltype: " + getFuelType();
    }
}
