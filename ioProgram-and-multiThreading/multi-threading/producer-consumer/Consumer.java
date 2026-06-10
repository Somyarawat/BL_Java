
class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run(){
        while (true) { 
            try {
                this.c.consumeItem();
            } catch (Exception ex) {
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
    
}