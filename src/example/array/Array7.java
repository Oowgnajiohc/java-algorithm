package example.array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] seats = new int[5][4];

        while (true) {
            System.out.println("현재 좌석 배치:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("예매할 좌석의 행과 열 번호를 입력하세요 (종료하려면 -1 입력):");
            int row = scanner.nextInt();
            if (row == -1) break;
            int col = scanner.nextInt();

            if (row < 0 || row >= 5 || col < 0 || col >= 4) {
                System.out.println("잘못된 좌석 번호입니다. 다시 입력하세요.");
                continue;
            }

            if (seats[row][col] == 1) {
                System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택하세요.");
            } else {
                seats[row][col] = 1;
                System.out.println("좌석이 예매되었습니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

}

