/*
    Name:Shashvat Kawali
    Aim:WAP to create a calculator class to add two numbers. Use constructor overloading to
    initialize the data with either default values or user provided values. Use method
    overloading to add integer or double.
    Class:SE Comps A

*/
class Calculator {
    int num1;
    int num2;

    Calculator() {
        this.num1=0;
        this.num2=0;
    }

    Calculator(int n1,int n2) {
        this.num1=n1;
        this.num2=n2;
    }

    void add(int i,int j){
        int sum=i+j;
       System.out.println("Add interger:"+sum); 
    }

    void add(double i,double j){
        double sum=i+j;
       System.out.println("Add double:"+sum); 
    }
}


