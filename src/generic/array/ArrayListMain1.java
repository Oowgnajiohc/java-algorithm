package generic.array;

import java.util.ArrayList;

public class ArrayListMain1 {
    public static void main(String[] args) {
        ArrayList<String> interests = new ArrayList<>();

        interests.add("사랑");
        interests.add("낭만");
        interests.add("슬픔");



        for (String interest : interests) {
            System.out.println(interest);
        }
    }
}