package OOPS_JAVA;

import java.util.Scanner;

class Pencils{
    private String color;
    private int tip;
    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }
    void setColor(String color){
        this.color = color;
    }
    void setTip(int newTip){
        this.tip = tip;
    }
}
public class Getters_And_Setters_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pencils p1 = new Pencils();
        p1.setColor("Orange");
        System.out.println(p1.getColor());

        p1.setTip(78);
        System.out.println(p1.getTip());

    }
}
