public class Demo1 {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }

}

abstract class Car {
    void start() {
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {

    @Override
    void accelerate() {
        System.out.println("FuelCar accelerating ");
    }

    @Override
    void brake() {
        System.out.println("FuelCar breaking");
    }

}

class ElectricCar extends Car {

    @Override
    void accelerate() {
        System.out.println("ElectricCar accelerating ");
    }

    @Override
    void brake() {
        System.out.println("ElectricCar breaking");
    }
}