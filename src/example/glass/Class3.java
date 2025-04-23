package example.glass;

public class Class3 {
    String name;
    int studentId;
    int grade;

    //생성자 는 클래스와 이름이 같다
    public Class3(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    //메서드
    public void introduce(){
        System.out.println(this.name + " " + this.studentId + " " + this.grade);
    }
}
