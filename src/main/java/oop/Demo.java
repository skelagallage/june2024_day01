package oop;

public class Demo {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Vitz", 2018, 4);
        car.displayInfo();
        System.out.println("-------------------");

        MotoBike bike = new MotoBike("Honda", "CBR", 2016);
        bike.setHasCarrier(true);
        bike.displayInfo();
        System.out.println("Having carrier : " + bike.isHasCarrier());
    }
}
