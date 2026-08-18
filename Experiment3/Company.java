/*
    Name:Shashvat Kawali
    Aim:Programs on various types of inheritance and
    Exception handling.
    Class:SE Comps A

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your gender:");
            String gender = sc.nextLine();
            System.out.println("Enter your height:");
            float height = sc.nextFloat();
            System.out.println("Enter your empId:");
            int empId = sc.nextInt();
            System.out.println("Enter your salary:");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your role:");
            String role = sc.nextLine();
            System.out.println("Enter your department:");
            String dept = sc.nextLine();
            System.out.println("Enter the no of employee in your department:");
            int numEmployee = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your project:");
            String project = sc.nextLine();

            Manager m2 = new Manager(name, age, gender, height,empId, salary,role,dept, numEmployee,project);
            m2.display();
        } 
        catch(InputMismatchException e){
            System.out.println("enter integer!!!!");
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("ivalid input");
        }

    }
}
