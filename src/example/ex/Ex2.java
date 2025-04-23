package example.ex;

public class Ex2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            System.out.print(a + " ");
            a++;
        }
        int b = 10;
        while (b > 0) {
            System.out.print(b + " ");
            b--;

        }
        int c = 0;
        while(true){
            if(c>10){
                break;
            }
            System.out.print(c+ " ");
            c++;
        }
    }
}
