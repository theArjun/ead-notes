class LazySingleObject {
    
    // create static object and declare it
    // the object is declared not initialized
    // it is called lazy initialization as initializaiton is done when needed, not early
    private static LazySingleObject object;

    // Make the constructor private so that the object cannot be instantiated.
    // It can only be accessed through getInstance()
    private LazySingleObject(){};

    // method to initialized and return the object of the class
    public static LazySingleObject getInstance() {
        if (object == null) {
            // if object is null, initialize
            object = new LazySingleObject();
        }
        return object;
    }

    public void displayMessage(){
        System.out.println("Object is instantiated");
    }
}


public class LazySingletonPattern {
    public static void main(String[] args) {

        // since the constructor is private, the statement below gives error
        // LazySingleObject object = new LazySingleObject();

        // getInstance() is static, so it doesn't need any object to be initialized for it to be called
        LazySingleObject object = LazySingleObject.getInstance();
        object.displayMessage();
    } 
}
