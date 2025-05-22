package outer;

public class OuterClass4Main {
    public static void main(String[] args) {
        hello(new Hello(){
            @Override
            public void hello(){
                System.out.println("Hello.hello");
            }
        });

    }
    public static void hello(Hello hello){
        hello.hello();
    }
}
