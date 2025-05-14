package interface1;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
    @Override
    public void move(){
        System.out.println("개 이동");
    }
    @Override
    public void introduce(){
        System.out.println("저는 개입니다. 눈은 " + DEFUALT_EYE_COUNT +"개 입니다.");
        System.out.println("충성심이 강하고 사람을 좋아합니다.");
    }
}
