//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!");

        System.out.println("Initializing banking system...");

        int totalNumberOfSimulations = 10;
        OperationsQueue operationsQueue = new OperationsQueue();
        Bank bank = new Bank("123", operationsQueue);

        System.out.println("Initializing simulation...");
        Thread simulationThread = new Thread(() -> {
            operationsQueue.addSimulation(totalNumberOfSimulations);
        });
        simulationThread.start();  // Start the simulation thread
        simulationThread.join();  // Wait for the simulation thread to finish

        System.out.println("Initializing deposit system...");
        Thread depositThread = new Thread(bank::deposit);
        depositThread.start();  // Start the deposit thread

        System.out.println("Initializing withdraw system...");
        Thread withdrawThread = new Thread(bank::withdraw);
        withdrawThread.start();  // Start the withdraw thread

        // Wait for deposit and withdraw threads to complete
        depositThread.join();
        withdrawThread.join();

        System.out.println("All possible transactions are Completed");
    }
}