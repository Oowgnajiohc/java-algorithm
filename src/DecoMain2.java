class DecoUtil2{
    public static String deco(String str){
        String result = "+" + str + "+";
        return result;

    }
}




public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello java";
        String deco = DecoUtil2.deco(s);
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
