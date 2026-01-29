package OOPS.Static_Example;

public class Human {
    int age;
    String name;
    double salary;
    boolean married;
//    Population is common to all the human beings on the planet
    static long population;

    public Human(int age , String name , double salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

//        this.population += 1;
        Human.population += 1;
    }
}
