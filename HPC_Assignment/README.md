# Banking System Simulation with Concurrent Operations

This project implements a concurrent banking system simulation using Java threads. The system demonstrates parallel processing of deposit and withdrawal operations in a banking environment, showcasing thread synchronization and queue-based operation management.

## Project Structure

```
HPC_Assignment/
├── src/
│   ├── Main.java           # Entry point of the application
│   ├── Bank.java           # Bank account implementation with concurrent operations
│   └── OperationsQueue.java # Queue management for banking operations
├── .gitignore
└── README.md
```

## Features

- Concurrent processing of banking operations
- Thread-safe deposit and withdrawal operations
- Queue-based operation management
- Simulation of multiple banking transactions
- Synchronized balance management
- Error handling for insufficient funds

## Technical Details

The project consists of three main components:

1. **Main Class**: Initializes the banking system and manages simulation threads
2. **Bank Class**: Implements the core banking functionality with synchronized methods
3. **OperationsQueue**: Manages the queue of banking operations

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended)

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd HPC_Assignment
   ```

2. Open the project in your preferred Java IDE
   - For IntelliJ IDEA:
     - Go to File → Open
     - Navigate to the project directory
     - Select and open the project

## How to Run

1. Compile the Java files:
   ```bash
   javac src/*.java
   ```

2. Run the application:
   ```bash
   java -cp src Main
   ```

## Program Flow

1. The system initializes with a bank account and an operations queue
2. A simulation thread generates a series of banking operations
3. Two concurrent threads process deposits and withdrawals
4. The system maintains thread safety using synchronized methods
5. Operations that cannot be processed (e.g., insufficient funds) are requeued

## Output

The program will display real-time information about:
- Deposit operations and resulting balance
- Withdrawal operations and resulting balance
- Failed operations due to insufficient funds
- Queue management operations

## Contributing

Feel free to fork the repository and submit pull requests for any improvements.

## License

This project is available under the MIT License. 