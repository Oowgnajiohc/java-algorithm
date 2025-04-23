class Car {
    private String name;
    private static int totalCars;


    public Car(String name) {
        this.name = name;
        totalCars++;
        System.out.println("차량 구입, 이름: " + this.name);
    }


    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}

public class StaticEx1 {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");
        Car.showTotalCars();
    }
}