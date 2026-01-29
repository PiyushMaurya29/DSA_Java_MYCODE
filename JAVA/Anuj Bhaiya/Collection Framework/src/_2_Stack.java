import java.util.Stack;

public class _2_Stack {
    public static void main(String[] args) {
        // LIFO

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Peacock");
        animals.push("Giraffe");
        animals.push("Donkey");
        System.out.println("Animals : "+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
