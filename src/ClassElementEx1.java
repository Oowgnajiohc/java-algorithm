class Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public  int Area() {
        return width * height;
    }
    public  int Perimeter() {
        return 2*(width + height);
    }
    public boolean isSquare() {
        return width == height;
    }




}


public class ClassElementEx1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Area is " + rectangle.Area());
        System.out.println("Perimeter is " + rectangle.Perimeter());
        System.out.println("Square is " + rectangle.isSquare());


    }
}
