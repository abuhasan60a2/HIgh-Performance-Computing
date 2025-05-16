# Queue Simulation System

This project implements a concurrent queue simulation system using Java threads. The system demonstrates different queue management scenarios (Bank and Grocery) with thread-safe operations and customer flow management.

## Project Structure

```
queue_simulator/
├── Main.java           # Entry point of the application
├── Customer.java       # Customer entity with arrival and service time
├── BankQueue.java      # Bank queue implementation with multiple tellers
└── GroceryQueue.java   # Grocery queue implementation
```

## Features

- Concurrent queue management
- Multiple queue types (Bank and Grocery)
- Thread-safe operations using ArrayBlockingQueue
- Customer arrival and service time tracking
- Multiple teller support for bank queues
- Queue capacity management
- Real-time statistics tracking
- Atomic operations for thread safety

## Technical Details

The project consists of four main components:

1. **Customer Class**: 
   - Manages customer properties (arrival time, service time)
   - Tracks customer service status

2. **BankQueue Class**:
   - Implements multi-teller banking queue
   - Tracks customers served and left
   - Uses ArrayBlockingQueue for thread safety
   - Handles queue overflow scenarios

3. **GroceryQueue Class**:
   - Implements single-line grocery queue
   - Provides queue size monitoring
   - Uses atomic operations for thread safety

4. **Main Class**:
   - Entry point for the simulation
   - Manages simulation parameters and execution

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended) or command-line Java compiler
- Basic understanding of concurrent programming

## Installation

1. Clone or download the project files:
   ```bash
   git clone <repository-url>
   cd queue_simulator
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

1. System initialization
   - Creation of queue instances with specified capacities
   - Setup of customer parameters (arrival and service times)

2. Queue Operations
   - Customers arrive and join queues
   - Tellers/servers process customers concurrently
   - Statistics are tracked in real-time

3. Statistics Tracking
   - Number of customers served
   - Queue lengths
   - Customers who left (in bank scenario)

## Output

The program will display real-time information about:
- Customer arrival and service times
- Queue lengths and waiting times
- Number of customers served
- Number of customers who left without service (bank queue)
- Queue capacity status
- Processing statistics

## Contributing

Feel free to fork the repository and submit pull requests for any improvements. Areas for potential enhancement include:
- Adding more queue types
- Implementing priority queues
- Adding customer satisfaction metrics
- Enhanced statistics and reporting
- GUI implementation
- Performance optimization
- Adding unit tests

## License

This project is available under the MIT License. 