package thread.homework;

public class Autosave implements Runnable {
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        try {
            while (!stop) {
                Thread.sleep(5000);
                if (!stop) {
                    System.out.println("자동 저장 완료!");
                }
            }
        } catch (InterruptedException e) {
            // 인터럽트가 걸리면 즉시 루프 탈출
        }
    }
}