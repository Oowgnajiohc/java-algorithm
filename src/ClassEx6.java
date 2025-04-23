class Field2{
    private  boolean bool;
    private int num1;
    private double num2;
    private String str;

    public void printFieldValue(){
        System.out.println(bool);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
    }
    public void printLocalValue(){
        int num;
        //System.out.println(num);

    }
}



public class ClassEx6 {
    public static void main(String[] args) {
        Field2 field2 = new Field2();
        field2.printFieldValue();
        field2.printLocalValue();


    }
}
