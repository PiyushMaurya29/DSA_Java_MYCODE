package OOPS.Static_Example;

public class Human_Test {
    public static void main(String[] args) {
        Human shaurya = new Human(20 , "Piyush" , 300000 , false);
        Human krishna = new Human(40 , "Govind" , 5600 , true);
        Human shurbhi = new Human(60 , "Shurbhi" , 8600 , true);


//        System.out.println(shaurya.population);
//        System.out.println(krishna.population);
//        System.out.println(shurbhi.population);

//        Use class name instead of Object name
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
