# Banking System Simulation with Concurrent Operations

This project implements a concurrent banking system simulation using Java threads. The system demonstrates parallel processing of deposit and withdrawal operations in a banking environment, showcasing thread synchronization and queue-based operation management.

## Project Structure

```
hpc-1/
├── Main.java           # Entry point of the application
├── Bank.java           # Bank account implementation with concurrent operations
└── OperationsQueue.java # Queue management for banking operations
```

## Features

- Concurrent processing of banking operations
- Thread-safe deposit and withdrawal operations
- Queue-based operation management
- Simulation of multiple banking transactions
- Synchronized balance management
- Error handling for insufficient funds
- Real-time transaction feedback

## Technical Details

The project consists of three main components:

1. **Main Class**: Initializes the banking system and manages simulation threads
2. **Bank Class**: Implements the core banking functionality with synchronized methods
3. **OperationsQueue**: Manages the queue of banking operations

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended) or command-line Java compiler

## Installation

1. Clone or download the project files:
   ```bash
   git clone <repository-url>
   cd hpc-1
   ```

2. Option 1 - Using an IDE:
   - Open the project in your preferred Java IDE
   - For IntelliJ IDEA:
     - Go to File → Open
     - Navigate to the project directory
     - Select and open the project

   Option 2 - Using Command Line:
   - Navigate to the project directory
   - No additional setup required

## How to Run

1. Compile the Java files:
   ```bash
   javac *.java
   ```

2. Run the application:
   ```bash
   java Main
   ```

## Program Flow

1. The system initializes with a bank account and an operations queue
2. A simulation thread generates a series of banking operations (10 simulations)
3. Two concurrent threads process deposits and withdrawals
4. The system maintains thread safety using synchronized methods
5. Operations that cannot be processed (e.g., insufficient funds) are requeued
6. Program terminates when all possible transactions are completed

## Output

The program will display real-time information about:
- System initialization status
- Deposit operations and resulting balance
- Withdrawal operations and resulting balance
- Failed operations due to insufficient funds
- Queue management operations
- Completion status of all transactions

## Contributing

Feel free to fork the repository and submit pull requests for any improvements. Areas for potential enhancement include:
- Adding more transaction types
- Implementing transaction logging
- Adding database integration
- Enhancing error handling
- Adding unit tests

## License

This project is available under the MIT License. 