package generic.map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> scores = new HashMap();

        System.out.println("검색할 학생 이름 입력:");
        String searchName = sc.nextLine();
        if(scores.containsKey(searchName)){
            System.out.println(searchName+"의 점수: "+scores.get(searchName));
        }else{
            System.out.println("학생을 찾을 수 없습니다.");
        }
        System.out.println("삭제할 학생 이름 입력:");
        String deleteName = sc.nextLine();

        if(scores.remove(deleteName)!=null){
            System.out.println(deleteName+"의 정보가 삭제되었습니다.");
        }else{
            System.out.println("삭제할 학생이 없습니다.");
        }



    }
}