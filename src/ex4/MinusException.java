package ex4;

public class MinusException extends Exception{
    public MinusException(){
        super();
    }
    public MinusException(String message){
        super(message);
    }
}
class OverException extends Exception{
    public OverException(){
        super();
    }
    public OverException(String message){}
}