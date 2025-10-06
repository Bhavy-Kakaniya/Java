class Demo{
    public Demo(){
        System.out.println("hello world without argument");
    }
    public Demo(int a){
        System.out.println("hello world with argument");
    }
    public Demo(int a, int b){
        System.out.println("hello world with arguments");
    }
}

class Inherit extends Demo{
    public Inherit(){
        super(10,20);
        System.out.println("extended");
    }
}
public class p1 {
    public static void main(String[] args) {
        Inherit i1 = new Inherit();
    }
}
