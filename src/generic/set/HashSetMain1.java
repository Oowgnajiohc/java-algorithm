package generic.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        System.out.println("이메일 주소 5개를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            emails.add(input); // 중복은 자동으로 제거됨
        }

        System.out.println("\n중복 제거 후 이메일 목록:");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println("\n총 " + emails.size() + "개의 이메일이 저장되었습니다.");
    }
}