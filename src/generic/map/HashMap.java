package generic.map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String>capital = new java.util.HashMap<>();
        capital.put("한국", "서울");
        capital.put("영국", "런던");
        capital.put("일본", "도쿄");

        System.out.println("<keySet() 사용>");
        for (String key : capital.keySet()) {
            System.out.println(key + "-> " + capital.get(key));
        }

        System.out.println("<entrySet() 사용>");
        for(Map.Entry<String, String> entry : capital.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
