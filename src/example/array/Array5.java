package example.array;

import java.util.Scanner;


public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 숫자의 개수를 입력: ");
        int s = scanner.nextInt();

        int[] numbers = new int[s];

        System.out.printf("%d개의 정수를 입력: ", s);
        for (int i = 0; i < s; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("입력받은 숫자:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}




