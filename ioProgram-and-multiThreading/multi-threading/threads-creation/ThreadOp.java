class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program Started");

        int x = 54 + 46;
        System.out.println("The sum is: " + x);

        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("The name of current thread is: " + tName);
        t.setName("My Main");
        System.out.println("New name of thread is: " + t.getName());
        //System.out.println("The ID of the current thread is: " + t.getId());

        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        // }

        System.out.println("Program Ended");
    }
}