class Company {
    int n;
    boolean flag = false;

    // Producer method
    synchronized void produce(int n) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.n = n;
        System.out.println("Produced: " + n);
        flag = true;
        notify();
    }

    // Consumer method
    synchronized void consume() {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + n);
        flag = false;
        notify();
    }
}

// Producer Thread
class Producer extends Thread {
    Company c;
    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            c.produce(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    Company c;
    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            c.consume();
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}
