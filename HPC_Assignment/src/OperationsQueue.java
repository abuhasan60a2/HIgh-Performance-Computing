import java.util.List;
import java.util.ArrayList;;
public class OperationsQueue {
    private final List<Integer> operations = new ArrayList<>();
    private boolean simulationComplete = false;

    public synchronized void addSimulation(int totalSimulation) {
        for (int i = 0; i < totalSimulation; i++) {
            int random;
            do {
                random = (int) (Math.random() * 200) - 100;
            } while (random == 0);

            add(random);
            System.out.println(i + ". New operation added: " + random);

            try {
                Thread.sleep((int) (Math.random() * 80));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        add(-9999);  // Sentinel value to indicate the end of operations
        simulationComplete = true;
        notifyAll();  // Notify all waiting threads that simulation is complete
    }

    public synchronized void add(int amount) {
        operations.add(amount);
        notifyAll();  // Notify all waiting threads that a new operation is available
    }

    public synchronized int getNextItem() {
        while (operations.isEmpty() && !simulationComplete) {
            try {
                wait();  // Wait until a new operation is available or simulation is complete
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (operations.isEmpty() && simulationComplete) {
            return -9999;  // Return sentinel value if simulation is complete
        }
        return operations.remove(0);
    }
}
