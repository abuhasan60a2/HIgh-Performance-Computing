import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class GroceryQueue {
    private final ArrayBlockingQueue<Customer> queue;
    private final AtomicInteger customersServed = new AtomicInteger(0);

    public GroceryQueue(int maxQueueLength) {
        this.queue = new ArrayBlockingQueue<>(maxQueueLength);
    }

    public boolean addCustomer(Customer customer) {
        return queue.offer(customer);
    }

    public Customer getNextCustomer() throws InterruptedException {
        Customer customer = queue.take();
        customersServed.incrementAndGet();
        return customer;
    }

    public int getQueueSize() { return queue.size(); }
    public int getCustomersServed() { return customersServed.get(); }
}