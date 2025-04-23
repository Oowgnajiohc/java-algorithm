package example.ex;

import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            System.out.println(num);
            num++;
        }

        scanner.close();
    }
}
