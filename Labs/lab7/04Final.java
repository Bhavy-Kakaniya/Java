//final variable
class FinalDemo {
    final int age = 18;

    void display() {
        // age++; this shows an error as final value can not be changed
        int newAge = age + age;
        System.out.print("Age is " + age);
        System.out.println(", New age is "+ newAge);
    }
}

//final method
class finalParent{
    final void show(){
        System.out.println("This is final method");
    }
}
class finalMethod extends finalParent{
    // void show(){} this shows an error as method is final and cannot be called in child class
}

final class FinalClass{
    int age = 19;
}
// class FinalChild extends FinalClass{
// this shows an error as class is final so it cannot extend
// }

public class _04final {
    public static void main(String[] args) {
        FinalDemo f1 = new FinalDemo();
        f1.display();
        finalMethod f2 = new finalMethod();
        f2.show();
    }
}
