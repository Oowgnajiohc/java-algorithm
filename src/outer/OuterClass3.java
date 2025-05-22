package outer;

public class OuterClass3 {
    public void method(){
        class Local{
            public void hello(){
                System.out.println("hello");
            }
        }
        Local local = new Local();
        local.hello();
    }
}

