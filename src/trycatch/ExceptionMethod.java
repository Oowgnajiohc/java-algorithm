package trycatch;

public class ExceptionMethod {
    public static void main(String[] args) {
        try{
            throw new Exception();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            throw new Exception("예외메시지");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
