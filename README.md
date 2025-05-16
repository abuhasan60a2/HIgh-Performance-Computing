# High Performance Computing (HPC) Projects Collection

This repository contains a collection of Java projects focusing on High Performance Computing concepts, particularly concurrent programming and multithreading. Each project demonstrates different aspects of parallel processing and thread management.

## Projects Overview

### 1. Banking System with Concurrent Operations (HPC_Assignment)
A concurrent banking system that handles deposits and withdrawals using multiple threads.

**Key Features:**
- Thread-safe deposit and withdrawal operations
- Queue-based operation management
- Synchronized balance management
- Real-time transaction feedback

[View Details](./HPC_Assignment/README.md)

### 2. Queue Simulation System (queue_simulator)
A concurrent queue simulation system demonstrating different queue management scenarios.

**Key Features:**
- Multiple queue types (Bank and Grocery)
- Thread-safe operations using ArrayBlockingQueue
- Customer flow management
- Real-time statistics tracking

[View Details](./queue_simulator/README.md)

### 3. Multithreading Introduction (multithreading-intro)
An educational project introducing basic concepts of multithreading in Java.

**Key Features:**
- Basic thread creation and management
- Concurrent operation handling
- Thread synchronization examples
- Queue-based operation management

[View Details](./multithreading-intro/README.md)

## Project Comparisons

### Implementation Approaches

1. **Thread Management**
   - HPC_Assignment: Uses dedicated threads for deposits and withdrawals
   - queue_simulator: Implements multiple service points with thread pools
   - multithreading-intro: Demonstrates basic thread creation and management

2. **Synchronization Methods**
   - HPC_Assignment: Synchronized methods for thread safety
   - queue_simulator: ArrayBlockingQueue for thread-safe operations
   - multithreading-intro: Basic synchronization examples

3. **Queue Implementation**
   - HPC_Assignment: Custom operations queue
   - queue_simulator: Multiple queue types with different behaviors
   - multithreading-intro: Simple transaction queue

## Common Features Across Projects

- Thread-safe operations
- Concurrent processing
- Real-time feedback
- Queue-based management
- Transaction validation
- Error handling

## Prerequisites

For all projects:
- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended) or command-line Java compiler
- Basic understanding of:
  * Java programming
  * Concurrent programming concepts
  * Thread management
  * Synchronization

## Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd HPC
   ```

2. Navigate to any project directory:
   ```bash
   cd [project-name]
   ```

3. Follow the specific README instructions in each project directory for:
   - Project setup
   - Building
   - Running
   - Testing

## Learning Path

1. Start with **multithreading-intro** to understand basic concepts
2. Move to **queue_simulator** to learn about different queue implementations
3. Explore **HPC_Assignment** for a complete banking system implementation

## Contributing

Contributions are welcome! For each project, you can:
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

All projects are available under the MIT License.

## Project Status

- HPC_Assignment: Complete
- queue_simulator: Complete
- multithreading-intro: Complete

## Contact

For questions or suggestions about any of these projects, please open an issue in the repository. 