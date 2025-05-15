package interface2;

public class AnimalSoundMain5 {
    public static void main(String[] args) {
        InterfaceAnimal[] animalArr = {new Cat(), new Dog()};
        for (InterfaceAnimal animal : animalArr) {
            animal.introduce();
            soundAnimal(animal);
            moveAnimal(animal);
            flyAnimal(animal);
            swimAnimal(animal);
            System.out.println();

        }

    }
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("도움 이동 테스트 종료");
    }
    private static void flyAnimal(InterfaceAnimal animal) {
        if(animal instanceof Fly flyAnimal){
            System.out.println("비행 기능 테스트 시작");
            flyAnimal.fly();
            System.out.println("비행 기능 테스트 종료");
        }
    }
    private static void  swimAnimal(InterfaceAnimal animal) {
        if (animal instanceof Swim swimAnimal){
            System.out.println("수영 기능 테스트 시작");
            swimAnimal.swim();
            System.out.println("수영 기능 테스트 종료");
        }
    }
}
