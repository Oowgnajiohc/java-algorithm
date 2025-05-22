package anonyex;

import java.util.Random;

public class AnonymousRefMainV4 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        hello(new Process() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        hello(new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }

        });

    }

}
