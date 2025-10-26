// Multithreading using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create first
        MyThread t2 = new MyThread(); // create second

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // first thread
        t2.start(); // second thread
    }
}

// using runnable
// Multithreading using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj, "Runnable-1");
        Thread t2 = new Thread(obj, "Runnable-2");

        t1.start();
        t2.start();
    }
}
