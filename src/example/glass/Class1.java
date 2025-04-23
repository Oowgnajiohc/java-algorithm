package example.glass;

public class Class1 {
    public static void main(String[] args) {
        Class2 c2 = new Class2();
        c2.name = "학생1";
        c2.age = 18;
        c2.grade = 90;

        Class2 c3 = new Class2();
        c3.name = "학생2";
        c3.age = 16;
        c3.grade = 80;

        Class2[] c4 = new Class2[]{c2,c3};
        for (int i = 0; i < c4.length; i++) {
            System.out.println("name: " + c4[i].name + ", age: " + c4[i].age + ", grade: " + c4[i].grade);
        }

    }
    }


