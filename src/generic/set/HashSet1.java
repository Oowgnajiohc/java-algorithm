package generic.set;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> members = new HashSet<>();
        members.add("오모리");
        members.add("모토키");
        members.add("오모리");//중복 저장 불가

        System.out.println(members);

    }
}
