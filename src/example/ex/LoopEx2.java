package example.ex;

import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        while (i <= 5) {
            System.out.println(n);
            n++;
            i++;
        }

        sc.close();
    }

}



