public class Bank {
    private final String accountNumber;
    private final OperationsQueue operationsQueue;
    private int balance = 0;

    public Bank(String accountNumber, OperationsQueue operationsQueue) {
        this.accountNumber = accountNumber;
        this.operationsQueue = operationsQueue;
    }

    // A deposit function that will run in parallel on a separate thread.
    // It will be a loop where in each iteration, it reads the amount from the operationsQueue and deposits the amount.

    public synchronized void deposit() {
        while (true) {
            int amount = operationsQueue.getNextItem();
            if (amount == -9999) {
                break;  // Terminate the loop if the sentinel value is encountered
            }
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + " Balance: " + balance);
            } else {
                operationsQueue.add(amount);
                System.out.println("Operation added back: " + amount);
            }
        }
    }

    // A withdraw function that will run in parallel on a separate thread.
    // It will be a loop where in each iteration, it reads the amount from the operationsQueue and withdraws the amount.

    public synchronized void withdraw() {
        while (true) {
            int amount = operationsQueue.getNextItem();
            if (amount == -9999) {
                break;  // Terminate the loop if the sentinel value is encountered
            }
            if (balance + amount < 0) {
                System.out.println("Not enough balance to withdraw: " + amount);
                operationsQueue.add(amount);  // Add the operation back to the queue
                continue;  // Skip to the next iteration if there is not enough balance
            }
            if (amount < 0) {
                balance += amount;
                System.out.println("Withdrawn: " + amount + " Balance: " + balance);
            } else {
                operationsQueue.add(amount);
                System.out.println("Operation added back: " + amount);
            }
        }
    }
}