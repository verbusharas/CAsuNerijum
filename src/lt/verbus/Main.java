package lt.verbus;

public class Main {

    public static void main(String[] args) {
        System.out.println(greet("Šarūnai"));
        System.out.println(greet("Gitanai"));
    }

    public static String greet(String name) {
        return String.format("%s %s%s","Hello,", name, "!");
    }
}