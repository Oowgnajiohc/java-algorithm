package generic.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Map1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> scores = new HashMap<>();
        scores.put("민규", Arrays.asList(95, 90, 87));
        scores.put("선웅", Arrays.asList(80,88));

        for(String name : scores.keySet()) {
            List<Integer> scoreList = scores.get(name);
            System.out.println(name + "의 점수: " + scoreList);
        }
    }
}
