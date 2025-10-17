// Write a test program that initialize 
// an array of four Animal objects. If the object implements the Transport interface, the deliver () method is invoked
interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void display();
}

class Tiger extends Animal {
    @Override
    void display() {
        System.out.println("Tiger");
    }
}

class Camel extends Animal implements Transport {
    @Override
    void display() {
        System.out.println("Camel");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is used for transport.");
    }
}

class Deer extends Animal {
    @Override
    void display() {
        System.out.println("Deer");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    public void display() {
        System.out.println("Donkey");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is used for transport.");
    }
}

public class _03Animal {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };
        for (int i = 0; i < animals.length; i++) {
            animals[i].display();
            if (animals[i] instanceof Transport) {
                ((Transport) animals[i]).deliver();
            }
            System.out.println();
        }
    }
}
