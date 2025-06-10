package generic;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<String>();
        cart.add("Gibson");
        cart.add("PRS");
        System.out.println(cart.get(0));
        System.out.println(cart.get(1));
        cart.remove(1);
        System.out.println(cart.size()); //몇개가 남았는지
        System.out.println(cart.isEmpty());
    }
}
