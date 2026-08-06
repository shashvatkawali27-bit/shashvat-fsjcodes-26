/*
    Name:Shashvat Kawali
    Aim:WAP to store and display bank account details for users. Info like name, account
    number, balance, account type.
    Class:SE Comps A

*/

public class Task1 {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.name="ram";
        b1.accountNo=547843748;
        b1.balance=45111;
        b1.accountType="debit";
        b1.Display();
        
        Bank b2=new Bank();
        b2.name="aayush";
        b2.accountNo=7266159;
        b2.balance=45324;
        b2.accountType="debit";
        b2.Display();

    }
}


class Bank{
    String name;
    int accountNo;
    double balance;
    String accountType;

    void Display(){
        System.out.println("-----------------");
        System.out.println("User Name:"+name);
        System.out.println("User account number:"+accountNo);
        System.out.println("User account number:"+balance);
        System.out.println("User account type:"+accountType);

    }
}
