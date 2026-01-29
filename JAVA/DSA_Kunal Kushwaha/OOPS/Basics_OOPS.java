package OOPS;

public class Basics_OOPS {
    static class Student{
        int rNo;
        String name;
        double marks;
        // We need a way to add the values of the above
        // properties object by object
        // we need one word to access every object
        void greeting(){
            System.out.println("Hello! This is "+this.name);
        }
        void changeName(String name){
            this.name = name;
        }
        Student(){
            // This is how you call a constructor from another constructor
            // Internally : new Student (13 , "Default person" , 99.3);
            this(13 , "Default person" , 99.3);
        }
        Student(Student other){
            this.rNo = other.rNo;
            this.name = other.name;
            this.marks = other.marks;
        }
//        Constructor making
        Student(int rNo , String name , double marks){
            this.rNo = rNo;
            this.name = name;
            this.marks = marks;
        }
    }
    public static void main(String[] args) {


        /*
           No need to initialize again and again once we made a constructor
           s1.rNo = 99;
           s1.name = "kashish";
           s1.marks = 77.3;
         */
        Student s1 = new Student(98 , "Maurya" , 80);

        System.out.println(s1.rNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student random = new Student(s1);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);


        Student one = new Student();
        Student two = one;

        one.name = "Pratap Ji";
        System.out.println(two.name);

        final int temp = 99;
//        When final keyword is used then you can not modify that again
//        Initializing the final element while declaring is compulsory
//        temp = 33;
        System.out.println(temp);

        final Student ash = new Student();
        ash.name = "jay";
        ash.rNo = 21;
        ash.marks = 99;
//        Cannot be re assign the values again
//        ash = new Student(34 , "kishor" , 99.3);
    }
}
