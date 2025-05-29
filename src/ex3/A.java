package ex3;

public class A {
    void abc() throws NumberFormatException{
        bcd();
    }
    void bcd() throws NumberFormatException{
        cde();
    }
    void cde() throws NumberFormatException{
        int num = Integer.parseInt("10A");
    }
}
