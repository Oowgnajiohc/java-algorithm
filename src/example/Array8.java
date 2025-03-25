package example;

import java.util.Scanner;

public class Array8 {
    public static final int MAX_PRODUCTS = 10;
    public String[] names = new String[MAX_PRODUCTS];
    public int[] prices = new int[MAX_PRODUCTS];
    public int count = 0;

    public void addProduct(String name, int price) {
        if (count < MAX_PRODUCTS) {
            names[count] = name;
            prices[count] = price;
            count++;
            System.out.println("상품이 등록되었습니다.");
        } else {
            System.out.println("상품 저장 공간이 꽉 찼습니다.");
        }
    }

    public void showProducts() {
        if (count == 0) {
            System.out.println("등록된 상품이 없습니다.");
        } else {
            System.out.println("상품 목록:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + names[i] + " - " + prices[i] + "원");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array8 manager = new Array8();

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (manager.count < MAX_PRODUCTS) {
                    System.out.print("상품 이름: ");
                    String name = scanner.nextLine();
                    System.out.print("상품 가격: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    manager.addProduct(name, price);
                } else {
                    System.out.println("상품 저장 공간이 가득 찼습니다.");
                }
            } else if (choice == 2) {
                manager.showProducts();
            } else if (choice == 3) {
                System.out.println("프로그램 종료.");
                scanner.close();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}

