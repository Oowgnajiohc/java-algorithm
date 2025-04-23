package example.ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");

        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + "," + num2);

        sc.close();
    }
}

