package Sting_and_StringBuilder;

public class String_Builder {
    public static void main(String[] args) {

        /*
            In string builder all the changes are done with one object only
            no new objects formed in each iteration
         */
        // String Builder is mutable
        StringBuilder builder = new StringBuilder();

        for(int i=0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.delete(0,4);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

    }
}
