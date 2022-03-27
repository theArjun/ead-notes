public class Counter {
   //create an object of Counter
   private static Counter instance = new Counter();
   private static int count = 1;

   //make the constructor private so that this class cannot be
   //instantiated
   private Counter(){}

   //Get the only object available
   public static Counter getInstance(){
      return instance;
   }

   public void increment(){
      count++;
   }

   public void decrement(){
        count--;
   }

   public void showCount(){
        System.out.println("Count: " + count);
   }
}

