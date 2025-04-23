package example.ex;

public class Ex4 {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        while (true) {
            System.out.print(sum);
            sum += i;
            i++;

            if (sum >= 30) {
                break;
            }
        }
    }
}
