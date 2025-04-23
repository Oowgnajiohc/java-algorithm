package extends1;

class Car {
    public void move(){
        System.out.println("차를 이동합니다.");

    }
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}

class ElectricCar extends Car{
    @Override
    public void move(){
        System.out.println("전기차를 이동합니다.");
    }
}

class GasCar extends Car{
    @Override
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}
class HydrogenCar extends Car{
    @Override
    public void move(){

        System.out.println("수소차를 이동합니다.");
    }
}
public class CarMain{
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.move();
        electricCar.openDoor();
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar. move();
        gasCar .openDoor();
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor();
        hydrogenCar .openDoor();

    }
}


