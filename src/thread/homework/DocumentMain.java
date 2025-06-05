package thread.homework;

public class DocumentMain {
    public static void main(String[] args) {
        Autosave autosave = new Autosave();
        Thread autoThread = new Thread(autosave);

        autoThread.setDaemon(true);

        autoThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("문서 작성 중... " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        autosave.setStop(true);
        autoThread.interrupt();

        System.out.println("작업 종료");

    }
}