class OddEvenPrinter {
    synchronized void printOdd() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    synchronized void printEven() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    OddEvenPrinter obj;
    OddThread(OddEvenPrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printOdd();
    }
}

class EvenThread extends Thread {
    OddEvenPrinter obj;
    EvenThread(OddEvenPrinter obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printEven();
    }
}

public class OddEvenDemo {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        OddThread t1 = new OddThread(printer);
        EvenThread t2 = new EvenThread(printer);

        t1.start();
        t2.start();
    }
}
