import java.util.List;
import java.util.ArrayList;

public class OperationsQueue {
    private final List<Integer> operations = new ArrayList<>();

    // Adds random operations to the queue for simulation purposes.
    public void addSimulation(int totalSimulation) {
        for (int i = 0; i < totalSimulation; i++) {
            int random = (int) (Math.random() * 200) - 100;
            if (random != 0) {
                add(random);
                System.out.println(i + ". New operation added: " + random);
            }
            // Add a small delay to simulate the time taken for a new customer to arrive
            try {
                Thread.sleep((int) (Math.random() * 80));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        add(-9999);  // Sentinel value to indicate the end of operations
    }

    // Adds an amount to the queue.
    public synchronized void add(int amount) {
        operations.add(amount);
        notifyAll();  // Notify all waiting threads that a new operation is available
    }

    // Retrieves and removes the next item from the queue. Waits if the queue is empty.
    public synchronized int getNextItem() {
        while (operations.isEmpty()) {
            try {
                wait();  // Wait until a new operation is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return operations.remove(0);
    }
}