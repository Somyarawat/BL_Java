
class MyThread implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("The value of i is: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thread = new Thread(t);
        thread.start();

        // MyAnotherThread thr = new MyAnotherThread();
        // thr.start();

        // try {
        //     thread.join();
        //     thr.join();
        // } catch (InterruptedException e) {
        // }
    }
}