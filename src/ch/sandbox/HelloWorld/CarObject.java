package ch.sandbox.HelloWorld;

public class CarObject {
    public CarObject (String brand){
        System.out.println("The brand of the car is: " + brand);
        }

    public static void main(String[] args) {
        CarObject brandname = new CarObject("Maserati");
    }
}


