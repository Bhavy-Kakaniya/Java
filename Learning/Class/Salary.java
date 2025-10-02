import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int m){
        salary = m;
    }
    public void setName(String n){
        name  = n;
    }
}

public class office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        System.out.println("Enter name : ");
        emp1.setName("Abc");
        emp1.setSalary(123);
        System.out.println("Salary is "+emp1.getSalary());
        System.out.println("Name is "+emp1.getName());
    }
}
