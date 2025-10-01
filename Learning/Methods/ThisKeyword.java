class pen{
    String color;
    String type;
    public void printColor(){
        System.out.println(this.color);
    }
}
public class thisdemo {

    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color = "blue";
        pen pen2 = new pen();
        pen2.color = "red";
        pen1.printColor();
        pen2.printColor();
    }
}
