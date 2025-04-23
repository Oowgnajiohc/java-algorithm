package example.ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            System.out.println(input);
        }

        sc.close();
    }

}
