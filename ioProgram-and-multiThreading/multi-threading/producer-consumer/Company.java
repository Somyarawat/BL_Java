
class Company{
    int n;
    boolean f = false;
    synchronized public void produceItem(int n) throws Exception {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produced Item: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consumeItem() throws Exception{
        if(!f){
            wait();
        }
        System.out.println("Consume Item: " + this.n);
        f = false;
        notify();
        return this.n;
    }
}