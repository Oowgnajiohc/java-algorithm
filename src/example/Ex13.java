package example;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double totalPrice = 0;

        while (true) {
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String productName = scanner.nextLine();

                    System.out.print("가격을 입력하세요: ");
                    double price = scanner.nextDouble();

                    System.out.print("수량을 입력하세요: ");
                    int quantity = scanner.nextInt();

                    totalPrice += price * quantity;
                    System.out.println(productName + "(이)가 추가되었습니다. 현재 총 가격: " + totalPrice + "원");
                    break;

                case 2:
                    System.out.println("총 결제 금액: " + totalPrice + "원");
                    totalPrice = 0;
                    System.out.println("결제가 완료되었습니다.");
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;
            }
        }
    }
}