package generic;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<String>();
        cart.add("Gibson");
        cart.add("PRS");
        cart.add(1,"fender");
        cart.add(2,"jackson");
        cart.remove(0);

        for(String str : cart) {
            System.out.println(str);
        }
    }
}
