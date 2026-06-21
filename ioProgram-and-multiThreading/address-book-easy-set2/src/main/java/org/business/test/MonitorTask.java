package org.business.test;

public class MonitorTask implements Runnable {
    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println("Business Index Active");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

        }
    }
}
