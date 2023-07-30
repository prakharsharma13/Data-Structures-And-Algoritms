package functions;

public class Function {
    // Function to add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to find the maximum of two integers and return the result
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Function to check if a number is even and return true if it is, false otherwise
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function to greet a person by name and return a greeting message
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Using the add function
        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        // Using the findMax function
        int max = findMax(num1, num2);
        System.out.println("Max: " + max);

        // Using the isEven function
        System.out.println("Is 5 even? " + isEven(5));
        System.out.println("Is 10 even? " + isEven(10));

        // Using the greet function
        System.out.println(greet("Alice"));
        System.out.println(greet("Bob"));
    }
}
