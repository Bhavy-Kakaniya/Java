// class Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
// Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play 
// Fthe respective sports 
interface Playable {
    void Play();
}

class Football implements Playable {
    @Override
    public void Play() {
        System.out.println("play Football");
    }
}

class Volleyball implements Playable {
    @Override
    public void Play() {
        System.out.println("play Volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void Play() {
        System.out.println("play Basketball");
    }
}

public class _03Play {
    public static void main(String[] args) {
        Playable p1 = new Football();
        Playable p2 = new Volleyball();
        Playable p3 = new Basketball();
        p1.Play();
        p2.Play();
        p3.Play();
    }
}
