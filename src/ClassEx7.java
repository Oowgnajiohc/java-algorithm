class Construct {
    private String name;
    private int age;
    private int grade;

    public Construct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Construct (String name){
        this(name, 0, 0);
    }

    public Construct(){
        this("", 0, 0);
    }
    public void  print(){
        System.out.println("이름: " + name+" 나이: "+age+" 성적: "+grade);
    }



}
public class ClassEx7 {
    public static void main(String[] args) {
        Construct[] c = new Construct[]{
                new Construct("이우진", 10, 20),
                new Construct("김민규"),
                new Construct()

        };
        for(Construct i : c){
            i.print();
        }

    }
}