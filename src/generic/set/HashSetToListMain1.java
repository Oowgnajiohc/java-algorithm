package generic.set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HashSetToListMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> emails = new HashSet<>();

        System.out.println("이메일 주소 5개를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            emails.add(input); // 중복 제거
        }

        // HashSet → List 변환
        ArrayList<String> emailList = new ArrayList<>(emails);

        // 정렬
        Collections.sort(emailList);


        System.out.println("\n중복 제거 후 이메일 목록:");
        for (String email : emailList) {
            System.out.println(email);
        }

        System.out.println("\n총 " + emailList.size() + "개의 이메일이 저장되었습니다.");
    }
}