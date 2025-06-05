package thread.control;

import static thread.util.MyLogger.log;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try{
            log("start");
            log("myThread.state2 = " + Thread.currentThread().getState());

            log("sleep() satrt");
            Thread.sleep(3000);
            log("sleep() end");

            log("myThread.state4 = " + Thread.currentThread().getState());
            log("end");
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
