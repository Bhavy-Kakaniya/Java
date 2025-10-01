class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
zz
    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class Employee {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        emp1.setName("abcde");
        System.out.println(emp1.getName());
    }
}
