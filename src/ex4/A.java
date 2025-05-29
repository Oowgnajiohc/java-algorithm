package ex4;

class A {
    void checkScore(int score) throws MinusException,OverException{
        if(score<0){
            throw new MinusException("예외발생 : 음수값입력");
        }
        else if(score>100)
            throw new OverException("예외발생 : 100점 초과");
        else
            System.out.println("정상값입니다.");
    }

}
