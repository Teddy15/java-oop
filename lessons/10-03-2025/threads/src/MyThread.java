public class MyThread implements Runnable {
    private Integer id;
    private int counter;

    MyThread(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        increment();
        System.out.println("Thread from MyThread " +
                "running : " + id + "... ");
    }

    private void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
