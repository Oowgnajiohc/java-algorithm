package example;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println("총합: " + sum);
                break;
            }

            sum += num;
        }

        scanner.close();
    }
}

