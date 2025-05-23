package trycatch;

public class TryCatchMain1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("결과: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}