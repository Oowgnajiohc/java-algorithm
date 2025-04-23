package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicfield = 1;
        data.publicMethod();
        data.defaultfield = 2;
        data.defaultMethod();
        data.innerAccess();

    }
}
