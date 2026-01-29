package OOPS_JAVA;

import java.util.Scanner;

class Pen{
    // Properties and functions
    String color;
    int tip;
    void setColour(String newColour){
        color = newColour;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String passWord){
        password = passWord;
    }
}
public class Pens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating a pen object called p1
        Pen p1 = new Pen();
        p1.setColour("Blue");
        System.out.println(p1.color);
        p1.setTip(98);
        System.out.println(p1.tip);
        //p1.setColour("Yellow"); Or write
        p1.color = "Yellow";
        System.out.println(p1.color);

        // Bank Account
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Piyush Maurya";
//        myAcc.password = ";asfjfasd;"; // cannot be accessed directly because of private

        myAcc.setPassword("Hello JI");
    }
}
