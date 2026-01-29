package Arrays;

public class LengthArray {
    public static void main(String[] args) {
        int age[] = {34,55,67,7};
        age[1] = 34;
        System.out.println(age.length);
        System.out.println(age[1]);

        for(int i=0 ; i<4 ; i++){
            System.out.print(age[i]+"  ");
        }
        System.out.println();
        for(int ages : age){
            System.out.print(ages+"  ");
        }
    }
}
