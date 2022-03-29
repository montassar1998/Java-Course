public class Car {
    public static int carCount=0;
    public Car(){
        carCount++;
    }
    public String model;
    public int licencePlate;
    public Car(String model, int licencePlate){
        this.model=model;
        this.licencePlate=licencePlate;
        carCount++;
    }


}
