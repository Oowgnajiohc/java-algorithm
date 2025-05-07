class Animal{
    public void sound(){
        System.out.println("동물 소리");
    }
    public void move(){
        System.out.println("동물 이동");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    }

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
class cow extends Animal{
    @Override
    public void sound() {
        System.out.println("음메");
    }
}




public class PolyMain {
    public static void main(String[] args) {
        Animal []animals= {new Dog(),new Cat(),new cow()};
        for(Animal animal : animals){
            animal.sound();
        }
    }
}
