package example.ex;

import java.util.Scanner;

public class LoopEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sumWhile = 0;
        int i = 1;
        while (i <= num) {
            sumWhile += i;
            i++;
            System.out.print(sumWhile + " ");
        }


//        int sumFor = 0;
//        for (int j = 1; j <= num; j++) {
//            sumFor += j;
//        }
//        System.out.println(sumFor);
//
//        scanner.close();
//    }
//}

    }
}
