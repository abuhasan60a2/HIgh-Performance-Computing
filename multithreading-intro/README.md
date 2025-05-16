# Multithreading Introduction: Banking System Simulator

This project serves as an introduction to multithreading concepts in Java, implementing a simple banking system that handles concurrent deposits and withdrawals using multiple threads.

## Project Structure

```
multithreading-intro/
├── src/
│   ├── Main.java           # Entry point with thread initialization
│   ├── Bank.java           # Banking operations implementation
│   └── OperationsQueue.java # Queue management for transactions
├── .gitignore
└── untitled.iml
```

## Features

- Basic multithreading implementation
- Concurrent deposit and withdrawal operations
- Thread-safe transaction queue
- Simulation of multiple banking operations
- Balance management with overflow protection
- Transaction validation
- Real-time operation feedback

## Technical Details

The project consists of three main components:

1. **Main Class**: 
   - Initializes the banking system
   - Creates and manages three separate threads:
     * Simulation thread for generating operations
     * Deposit thread for processing deposits
     * Withdrawal thread for processing withdrawals

2. **Bank Class**:
   - Manages account balance
   - Implements deposit and withdrawal operations
   - Handles transaction validation
   - Provides operation feedback
   - Prevents negative balance scenarios

3. **OperationsQueue Class**:
   - Manages the transaction queue
   - Handles operation scheduling
   - Provides thread-safe operation access

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended) or command-line Java compiler
- Basic understanding of Java programming

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd multithreading-intro
   ```

2. Option 1 - Using IntelliJ IDEA:
   - Open IntelliJ IDEA
   - Go to File → Open
   - Navigate to the project directory
   - Select and open the project

   Option 2 - Using Command Line:
   - Navigate to the project directory
   - Move to the src directory:
     ```bash
     cd src
     ```

## How to Run

1. Using IntelliJ IDEA:
   - Open the project in IntelliJ IDEA
   - Run the Main class

2. Using Command Line:
   ```bash
   javac *.java
   java Main
   ```

## Program Flow

1. System Initialization
   - Creates an operations queue
   - Initializes a bank account
   - Sets up simulation parameters

2. Thread Creation and Execution
   - Simulation thread generates banking operations
   - Deposit thread processes positive transactions
   - Withdrawal thread processes negative transactions

3. Operation Processing
   - Validates transaction amounts
   - Updates account balance
   - Handles insufficient funds scenarios
   - Provides operation feedback

## Output

The program displays real-time information about:
- System initialization status
- Deposit operations and resulting balance
- Withdrawal operations and resulting balance
- Failed transactions due to insufficient funds
- Operation queue management
- Transaction completion status

## Learning Objectives

This project demonstrates several key concepts:
- Basic thread creation and management
- Concurrent operation handling
- Thread synchronization
- Queue-based operation management
- Safe shared resource access
- Transaction validation

## Contributing

Feel free to fork the repository and submit pull requests. Potential improvements include:
- Adding more sophisticated thread synchronization
- Implementing transaction logging
- Adding multiple account support
- Enhancing error handling
- Adding unit tests
- Implementing a user interface
- Adding transaction types
- Improving documentation

## License

This project is available under the MIT License. 