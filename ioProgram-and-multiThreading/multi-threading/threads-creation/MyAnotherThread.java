
class MyAnotherThread extends Thread {
    @Override
    public void run(){
        for (int j = 10; j >= 1; j--) {
            System.out.println("Value in another thread is: " + j);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        MyAnotherThread thr = new MyAnotherThread();
        thr.start();
    }
}