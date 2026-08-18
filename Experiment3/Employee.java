/*
    Name:Shashvat Kawali
    Aim:Programs on various types of inheritance and
    Exception handling.
    Class:SE Comps A

*/

public class Employee extends Person{
    private int empId;
    private int salary;
    private String role;
    private String dept;

    Employee(String name, int age, String gender, double height, int empId, int salary, String role, String dept) {
        super(name, age, gender, height);
        this.empId = empId;
        this.salary = salary;
        this.role = role;
        this.dept = dept;
    }

    void display() {
        super.display();
        System.out.println("EmpId" + empId);
        System.out.println("salary" + salary);
        System.out.println("role" + role);
        System.out.println("dept" + dept);
    }
}
