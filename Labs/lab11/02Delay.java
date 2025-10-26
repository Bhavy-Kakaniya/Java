class MessagePrinter implements Runnable {
    String message;
    int delay;

    MessagePrinter(String msg, int time) {
        message = msg;
        delay = time;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MessagePrinter morning = new MessagePrinter("Good Morning", 1000);
        MessagePrinter afternoon = new MessagePrinter("Good Afternoon", 3000);

        Thread t1 = new Thread(morning);
        Thread t2 = new Thread(afternoon);

        t1.start();
        t2.start();
    }
}
