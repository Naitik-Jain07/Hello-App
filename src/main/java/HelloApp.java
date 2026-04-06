public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Enhanced for loop
        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        System.out.println("Hello, " + names + "!");
    }
}