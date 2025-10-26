import java.util.Random;

// Thread for random no.
class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(100); // number between 0 to 99
            System.out.println("\nGenerated Number: " + num);

            if (num % 2 == 0) {
                new SquareThread(num).start();
            } else {
                new CubeThread(num).start();
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareThread extends Thread {
    int number;
    SquareThread(int num) {
        number = num;
    }

    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread {
    int number;
    CubeThread(int num) {
        number = num;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}
