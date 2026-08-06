/*
    Name:Shashvat Kawali
    Aim:WAP to create a calculator class to add two numbers. Use constructor overloading to
    initialize the data with either default values or user provided values. Use method
    overloading to add integer or double.
    Class:SE Comps A

*/

import java.util.Scanner;

public class CalculatorText {
    public static void main(String[] args) {
        Calculator c1=new Calculator();   
        System.out.println("num1:"+c1.num1+" num2:"+c1.num2);

        Calculator c2=new Calculator(3,4);
        System.out.println("num1:"+c2.num1+" num2:"+c2.num2);
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int x=sc.nextInt();
        System.out.print("Enter second number:");
        int y=sc.nextInt();
        c1.add(x,y);

        System.out.print("Enter first number:");
        double p=sc.nextDouble();
        System.out.print("Enter second number:");
        double q=sc.nextDouble();
        c1.add(p,q);

    }
}
