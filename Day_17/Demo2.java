public class Demo2 {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.accelerate();

    }
}

interface Car {
    void start();

    void accelerate();

    void brake();
}

class FuelCar implements Car {
    @Override
    public void start() {
        System.out.println("FuelCar start");
    }

    @Override
    public void accelerate() {
        System.out.println("FuelCar accelerating ");
    }

    @Override
    public void brake() {
        System.out.println("FuelCar breaking");
    }

}

class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("ElectricCar start");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricCar accelerating ");
    }

    @Override
    public void brake() {
        System.out.println("ElectricCar breaking");
    }
}