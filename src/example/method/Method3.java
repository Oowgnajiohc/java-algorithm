package example.method;

public class Method3 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);

    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미자는 출입 불가능합니다.");
            return;
        }
        System.out.println(age + "살, 입장하세요.");
    }
}
