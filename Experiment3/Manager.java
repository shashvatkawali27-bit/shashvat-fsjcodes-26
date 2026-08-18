/*
    Name:Shashvat Kawali
    Aim:Programs on various types of inheritance and
    Exception handling.
    Class:SE Comps A

*/

public class Manager extends Employee {
    private int numEmployee;
    private String project;

    Manager(String name, int age, String gender, double height, int empId, int salary, String role, String dept,
            int numEmployee, String project) {
        super(name, age, gender, height, empId, salary, role, dept);
        this.numEmployee = numEmployee;
        this.project = project;
    }

    void display() {
        super.display();
        System.out.println("numEmployee" + numEmployee);
        System.out.println("project" + project);
    }
}
