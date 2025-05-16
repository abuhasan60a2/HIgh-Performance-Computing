import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BankQueue {
    private final ArrayBlockingQueue<Customer> queue;
    private final int numTellers;
    private final AtomicInteger customersServed = new AtomicInteger(0);
    private final AtomicInteger customersLeft = new AtomicInteger(0);

    public BankQueue(int numTellers, int maxQueueLength) {
        this.numTellers = numTellers;
        this.queue = new ArrayBlockingQueue<>(maxQueueLength);
    }

    public boolean addCustomer(Customer customer) {
        if (queue.offer(customer)) {
            return true;
        } else {
            customersLeft.incrementAndGet();
            return false;
        }
    }

    public Customer getNextCustomer() throws InterruptedException {
        Customer customer = queue.take();
        customersServed.incrementAndGet();
        return customer;
    }

    // Getters for statistics
    public int getCustomersServed() { return customersServed.get(); }
    public int getCustomersLeft() { return customersLeft.get(); }
}