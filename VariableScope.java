public class Main {

    // Global variable (accessible by any method in this class)
    static int globalCount = 100;

    // Main method - entry point of the program
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount);

        // Calling the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable (only accessible inside showScope method)
        int localCount = 50;

        // Accessing the global variable
        System.out.println("Global Count (from showScope): " + globalCount);

        // Accessing the local variable
        System.out.println("Local Count (from showScope): " + localCount);
    }
} 
