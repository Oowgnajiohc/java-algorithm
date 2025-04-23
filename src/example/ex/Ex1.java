package example.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("평점을 입력하세요. ");
        double rating = scanner.nextDouble();

        if (rating <= 9) {
            System.out.println("어바웃타임");
        }
        if (rating <= 8) {
            System.out.println("토이스토리");
        }
        if (rating <= 7) {
            System.out.println("고질라");
        }
    }
}
