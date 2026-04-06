public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (String name : args) {

            // Capitalize first letter using substring
            String formattedName =
                    name.substring(0, 1).toUpperCase() +
                            name.substring(1).toLowerCase();

            if (result.length() > 0) {
                result.append(", ");
            }

            result.append(formattedName);
        }

        System.out.println("Hello, " + result + "!");
    }
}