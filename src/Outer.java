public class Outer {
    private int x = 10;

     class Inner {
         int x = 20;
         public void printX() {
             System.out.println("Inner x : " + x);
             System.out.println("Outer x : " + Outer.this.x);
         }
     }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printX();
    }
}
