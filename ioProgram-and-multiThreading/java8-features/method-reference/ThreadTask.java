
class ThreadTask {

    static void threadTask(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    public static void main(String[] args) {
        Runnable runnable = ThreadTask::threadTask;
        Thread t = new Thread(runnable);
        t.start();
    }
}