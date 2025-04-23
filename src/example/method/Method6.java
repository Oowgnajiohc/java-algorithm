package example.method;

public class Method6 {
    public static void main(String[] args) {
        method("Hello, World!",3);
        method("진주쌤 짱",5);
        method("2-1 바보",7);


    }
    public static void method(String a, int b) {
        for(int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
