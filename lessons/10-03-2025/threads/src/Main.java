public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(1); // state NEW
        //thread.run(); // state RUNNABLE

        Thread t1 = new Thread(thread, "Task1");
        Thread t2 = new Thread(new MyThread(2), "Task2");
        System.out.println(t2.getState());
        Thread t3 = new Thread(new MyThread(3), "Task3");

        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        System.out.println(t2.getState());
        t1.start();
        t3.start();

        try {
            System.out.println(t2.getState());
            t3.join();
            System.out.println(t2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getCounter());

//        System.out.print(t1.getName() + " " + t1.getPriority());
    }
}