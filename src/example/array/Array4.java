package example.array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int total = 0;

        for (int j : numbers) {
            total += j;
        }
        double average = (double) total / numbers.length;

        System.out.println(total);
        System.out.println(average);
    }

}
