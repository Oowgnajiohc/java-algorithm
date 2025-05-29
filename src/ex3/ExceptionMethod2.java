package ex3;

public class ExceptionMethod2 {
    public static void main(String[] args) {
        A a = new A();
        try{
            a.abc();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}
