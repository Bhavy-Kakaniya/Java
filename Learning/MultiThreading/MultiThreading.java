class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("THREAD");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("thread");
        }
    }
}

class myRunnnableThread1 implements Runnable {
    public void run() {
        System.out.println("Runnable thread 1");
    }
}

class myRunnnableThread2 implements Runnable {
    public void run() {
        System.out.println("Runnable thread 2");
    }
}

class Mythr extends Thread {
    public Mythr(String name) {
        super(name); // calls Thread class constructor
    }

    // optional: a no-argument constructor so you can also do new Mythr()
    public Mythr() {
        super("DefaultThread");
    }

    public void run() {
        while (true) {
            System.out.println("I am a thread " + this.getName());
        }
    }
}

public class p1 {
    public static void main(String[] args) {
        // Example 1: Using Thread class directly
        // MyThread1 t1 = new MyThread1();
        // MyThread2 t2 = new MyThread2();
        // t1.start();
        // t2.start();

        // Example 2: Using Runnable interface
        // myRunnnableThread1 bullet1 = new myRunnnableThread1();
        // Thread gun1 = new Thread(bullet1);
        // myRunnnableThread2 bullet2 = new myRunnnableThread2();
        // Thread gun2 = new Thread(bullet2);
        // gun1.start();
        // gun2.start();

        // Example 3: Naming and prioritizing threads
        // Mythr t01 = new Mythr("hello1");
        // Mythr t02 = new Mythr("hello2");
        // Mythr t03 = new Mythr("hello3");
        // Mythr t04 = new Mythr("hello4");
        // Mythr t05 = new Mythr("hello5");
        // t01.start();
        // t02.start();
        // t03.start();
        // t04.start();
        // t05.start();
        // t05.setPriority(Thread.MAX_PRIORITY);

        // Example 4: Using default constructor
        Mythr t1 = new Mythr(); // works now
        t1.start();
    }
}
