public class SingleCounterDemo {
    public static void main(String[] args) {
        //create an object of Counter
        Counter counter_one = Counter.getInstance();
        Counter counter_two = Counter.getInstance();

        // Display both counts
        counter_one.showCount();
        counter_two.showCount();

        // Increment counter one.
        counter_one.increment();

        // Display both counts
        counter_one.showCount();
        counter_two.showCount();

        // Increment counter two.
        counter_two.increment();

        // Display both counts
        counter_one.showCount();
        counter_two.showCount();
    }
}
