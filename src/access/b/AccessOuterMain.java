package access.b;

import access.a.AccessData;


public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicfield = 1;

        data.publicMethod();
        data.innerAccess();

    }
}
