import java.util.*;
class AccountHolder{
    private String name;
    private float amount;
    /**
     *
     */
    private int accNum;

    void insert(int a,String n,float amt){
        accNum = a;
        name = n;
        amount = amt;
    }

    void deposit(float dAmt){
        amount = amount + dAmt;
        System.out.println("DEPOSITED AMOUNT = "+dAmt);
        System.out.println("CURRENT BALANCE = "+amount);
    }

    void withDraw(int wAmt){
        if(wAmt > amount){
            System.out.println("INSUFFICIENT FUNDS");
        }
        else{
            amount = amount - wAmt;
        }
        System.out.println("AMOUNT WITHDRAWN = "+wAmt);
    }

    void checkBalance(){
        System.out.println("TOTAL BALANCE = "+amount);
    }
    void display(){
        System.out.println("|*******************************************************************|");
        System.out.println("ACCOUNT NUMBER = "+accNum+ "\n"+"NAME = "+ name + "\n"  + "TOTAL BALANCE = "+amount);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        
    
    AccountHolder A1 = new AccountHolder();
    A1.insert(6731,"ARUSH",250000);
    A1.deposit(90000);
    A1.withDraw(70000);
    A1.checkBalance();
    A1.display();
}
}
