class Student3 {
    private String name;
    private int age;
    private String gender;

    //생성자
    public Student3(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void show(){
        System.out.println("이름: "+ this.getName() +", 나이: "+ this.getAge() +", 성별: "+ this.getGender());
    }
}



public class ClassEx3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("최해성", 18, "m");
        Student3 s2 = new Student3("이우진",18,"m");

        Student3[] s = new Student3[2];
        s[0] = s1;
        s[1] = s2;

        for(Student3 i : s){
            i.show();
        }

    }
}


