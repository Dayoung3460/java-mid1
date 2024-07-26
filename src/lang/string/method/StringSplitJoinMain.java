package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        String[] fruits = str.split(", ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(String.join("-", "A", "B", "C"));
        System.out.println(String.join("-", fruits));
    }
}
