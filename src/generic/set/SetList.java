package generic.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과","바나나","사과","메론");
        Set<String> set = new HashSet<>(list);

        List<String> newList = new ArrayList<>(set);
        Collections.sort(newList);

        System.out.println("정렬된 과일 목룍: ");
        for (String s : newList) {
            System.out.println(s);
        }

    }
}
