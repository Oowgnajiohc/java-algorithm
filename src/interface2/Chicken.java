package interface2;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound(){
        System.out.println("꼬끼오");
    }
    @Override
    public void move(){
        System.out.println("닭 이동");
    }
    @Override
    public void fly() {
        System.out.println("잠깐 날 수 있지만 멀리 날지는 못함");
    }
    @Override
    public void introduce(){
        System.out.println("저는 닭입니다 .눈은 " + DEFUALT_EYE_COUNT + "개 입니다.");
        System.out.println("저는 잠깐 날 수 있습니다.");
    }
}
