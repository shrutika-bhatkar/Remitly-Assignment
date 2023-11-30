package Singleton;

public class Singleton {

	

    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to get the instance of the Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton1 = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton1.showMessage();

        // Try to create another instance (will return the existing instance)
        Singleton singleton2 = Singleton.getInstance();

        // The two instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
	
	
}
