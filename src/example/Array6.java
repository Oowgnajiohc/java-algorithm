package example;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 숫자의 개수를 입력: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.printf("%d개의 정수를 입력: ", n);
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("가장 작은 수: " + min);
        System.out.println("가장 큰 수: " + max);

        scanner.close();
    }
}
