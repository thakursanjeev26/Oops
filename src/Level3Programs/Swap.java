package Level3Programs;
class Employee{
    String name;
    int age;

    public Employee(String name,int age){
        this.age=age;
        this.name=name;
    }
    void output(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }


}




public class Swap {
    static void swap(Employee E1, Employee E2){
        String temp;
        int tempage;

        tempage=E1.age;
        E1.age=E2.age;
        E2.age=tempage;

        temp=E1.name;
        E1.name=E2.name;
        E2.name=temp;

    }

    public static void main(String[] args) {
        Employee E1= new Employee("Sanjeev",23);
        Employee E2 = new Employee("Rushi",22);

        System.out.println("before Swapping");
        E1.output();
        E2.output();

        swap(E1,E2);

        System.out.println("After Swapping");
        E1.output();
        E2.output();


    }
}
