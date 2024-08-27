package Level1Programs;

public class Employee {
    int ID;
    String Name;
    double salary;

    public Employee(int ID,String Name,float salary){
        this.ID=ID;
        this.Name=Name;
        this.salary=salary;
    }
    public double CalculateSalary(){
       return salary*12;
    }
    void display(){
        System.out.println("Employee ID: "+ID);
        System.out.println("Employee Name:" + Name);
        System.out.println("Employee Salary: "+CalculateSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"Sanjeev",2000);
        emp.display();

    }
}
