package example;

import java.util.Scanner;

public class LoopEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 2 != 0) {
            num++;
        }

        int count = 0;

        for (; count < 5; count++) {
            System.out.println(num);
            num += 2;
        }

        scanner.close();
    }
}
