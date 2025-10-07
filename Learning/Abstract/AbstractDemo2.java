class parent{
    void h1(){
        System.out.println("hello");
    }
    parent(){
        System.out.println("this is constructor of parent class");
    }
}

class child extends parent{
    void h2(){
        System.out.println("hello from child class");
    }
    child(){
        super();// there will be same output even if we dont write it
        System.out.println("this is constructor of child class");
    }
}
public class a2 {
    public static void main(String[] args) {
        child c1 = new child();
        c1.h1();
        System.out.println("c1.h1 finished");
        c1.h2();
        System.out.println("c1.h2 finished");
        System.out.println();
        parent p1 = new parent();
        p1.h1();
        System.out.println("p1.h1 finished");
    }
}

//QUESTION 1:-
//---------------------------------------------------------------------------
//this is the output when we write
//class parent{
//  void h1(){
//      System.out.println("hello");
//  }
//}
// class child extends parent{
//     void h2(){
//         System.out.println("hello from child class");
//     }
// }

// hello
// c1.h1 finished
// hello from child class
// c1.h2 finished
//
//hello
//p1.h1.finished
//---------------------------------------------------------------------------

// QUESTION 2:-
//---------------------------------------------------------------------------
// class parent{
//     void h1(){
//         System.out.println("hello");
//     }
//     parent(){
//         System.out.println("this is constructor of parent class");
//     }
// }
// class child extends parent{
//     void h2(){
//         System.out.println("hello from child class");
//     }
// }


// QUESTION 3:-
//---------------------------------------------------------------------------
// class parent{
//     void h1(){
//         System.out.println("hello");
//     }
//     parent(){
//         System.out.println("this is constructor of parent class");
//     }
// }

// class child extends parent{
//     void h2(){
//         System.out.println("hello from child class");
//     }
//     child(){
//         super();// there will be same output even if we dont write it
//         System.out.println("this is constructor of child class");
//     }
// }
// this is constructor of parent class
// this is constructor of child class
// hello
// c1.h1 finished
// hello from child class
// c1.h2 finished

// this is constructor of parent class
// hello
// p1.h1 finished

        // child c1 = new child();
        // c1.h1();
        // System.out.println("c1.h1 finished");
        // c1.h2();
        // System.out.println("c1.h2 finished");
        // System.out.println();
        // parent p1 = new parent();
        // p1.h1();
        // System.out.println("p1.h1 finished");


//conclusion
/*
    => whenever we call a method of a class then it calls the constructor first and then the method which is to be called.
    => if we call a method from parent class using child reference then it will call parentconstructor then child constructor then the 
       method which is called originally.
    => if we call the method in sub class using reference of child then it will print method only
    => constructor is called directly as we create object of class.

*/
