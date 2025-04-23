package access.a;

public class AccessData {
    public int publicfield;
    int defaultfield;
    private int privatefield;
    public void publicMethod(){
        System.out.println("publicMethod 호출" + publicfield);
    }
    void defaultMethod(){
        System.out.println("defaultMethod 호출 " + defaultfield);
    }
    public void privateMethod(){
        System.out.println("privateMethod" + privatefield);
    }
    public void innerAccess(){
        System.out.println("내부 호출");
        publicfield = 100;
        defaultfield = 200;
        privatefield = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
