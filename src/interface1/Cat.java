package interface1;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound(){
        System.out.println("냐옹");
    }
    @Override
    public void move(){
        System.out.println("고양이 이동");
    }
    @Override
    public void introduce(){
        System.out.println("저는 고양이입니다. 눈은 " + DEFUALT_EYE_COUNT + "입니다.");
        System.out.println("독립적인 성격을 가지고 있습니다.");
    }

}
