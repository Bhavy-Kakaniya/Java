interface Bicycle { 
    void applyBrake();
    void speedUp();
}

interface Bicycle2 {
    void applyBrake2();
    void speedUp2();
}

class NewCycle implements Bicycle, Bicycle2 {
    void blowHorn() {
        System.out.println("HORN");
    }

    public void applyBrake() {
        System.out.println("Apply brakes");
    }

    public void speedUp() {
        System.out.println("Speed up");
    }

    public void applyBrake2() {
        System.out.println("Apply brakes (Bicycle2)");
    }

    public void speedUp2() {
        System.out.println("Speed up (Bicycle2)");
    }
}

public class p1 {
    public static void main(String[] args) {
        NewCycle cycle = new NewCycle();
        cycle.blowHorn();
        cycle.applyBrake();
        cycle.speedUp();
        cycle.applyBrake2();
        cycle.speedUp2();
    }
}
