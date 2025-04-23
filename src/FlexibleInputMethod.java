public class FlexibleInputMethod {
    public static void printIntData(int...values){
        System.out.println("input int data length: " + values.length);
        for (int value : values) {
            System.out.println(value);
        }
    }
    public static void printStringData(String... values){
        System.out.println("input string data length: " + values.length);
        for (String value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        printIntData(0, 1, 2, 3, 4, 5);
        printIntData(1, 2, 3);
        printStringData("apple", "orange", "watermelon");
        printStringData();
    }
}
