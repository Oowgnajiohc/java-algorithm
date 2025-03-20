package example;

import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            num++;
        }

        int count = 0;

        while (count < 5) {
            System.out.println(num);
            num += 2;
            count++;
        }

        scanner.close();
    }
}
