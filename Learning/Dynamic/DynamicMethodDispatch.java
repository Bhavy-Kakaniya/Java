class one {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("my name is java");
    }
}

class two extends one {
    public void hw() {
        System.out.println("Hello World");
    }

    public void name() {
        System.out.println("my name is java class 2");
    }
}

public class p1 {
    public static void main(String[] args) {
        one obj = new two();// this is called dynamic method dispatch reverse is not allowed
        // super object = new sub
        // obj.hw(); throws error because the method is in child class so parent class
        // cannot access it
        obj.name();
        obj.greet();// this method dont shows error because the method is is in parent class and
                    // reference is also to parent
        // basically we cannot access the method which are not inherited from parent if
        // we make object of child and giving reference to
        // parent
        two obj1 = new two();
        obj1.hw();// this can be written because the object is of child and method is also in
                  // child
        one obj2 = new one();
        obj2.greet();
        obj2.name();
    }
}
