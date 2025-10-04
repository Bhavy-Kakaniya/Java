import java.util.Scanner;

class myEmployee {
    private int id;
    private String name;

    public myEmployee(String my_name) {
        id = 123;
        name = my_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myEmployee bhavy = new myEmployee("Bhavy");
        // bhavy.setName("bhavy kakaniya");
        // bhavy.setId(123);
        System.out.println(bhavy.getId());
        System.out.println(bhavy.getName());
    }
}
