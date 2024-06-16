package oop;

public class Car extends Vehicle implements Drivable{

    private int noOfDoors;

    public Car(String make, String model, int year, int noOfDoors) {
        super(make, model, year);
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void start() {

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("No of door : " + noOfDoors);
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
    }
}
