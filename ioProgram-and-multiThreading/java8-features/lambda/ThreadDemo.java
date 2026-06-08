
class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("The value of i is: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Print");
        t.start();
        
        Runnable thread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
        };
        Thread t2 = new Thread(thread2);
        t2.setName("Table");
        t2.start();
    }
}