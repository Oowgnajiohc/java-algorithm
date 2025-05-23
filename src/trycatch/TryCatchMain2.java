package trycatch;

public class TryCatchMain2 {
    public static void main(String[] args) {
        String input = "12A";
        try {
            int num = Integer.parseInt(input);
            System.out.println("변환된 숫자: " + num);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }
    }
}