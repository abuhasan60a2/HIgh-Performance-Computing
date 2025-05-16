# Dining Philosopher Simulation

## Overview

This project simulates the Dining Philosophers problem, a classic synchronization problem in computer science. The simulation involves philosophers sitting at a table with forks between each pair of philosophers. Each philosopher alternates between thinking and eating, but to eat, they need to pick up both the left and right forks.

## Files

- `Main.java`: The entry point of the simulation. It initializes the `TableManager` and starts the simulation.
- `TableManager.java`: Manages the tables and philosophers. It initializes the philosophers and forks, detects deadlocks, and moves philosophers to a sixth table if a deadlock occurs.
- `Philosopher.java`: Represents a philosopher. Each philosopher alternates between thinking and eating, and tries to pick up the left and right forks to eat.

## How It Works

1. **Initialization**: 
    - Five tables are created, each with five philosophers.
    - Each philosopher is assigned two forks (left and right).

2. **Simulation**:
    - Philosophers think for a random amount of time.
    - They then try to pick up the left fork and, after a delay, the right fork.
    - If successful, they eat for a random amount of time.
    - If unable to pick up both forks, they release any fork they have picked up and continue thinking.

3. **Deadlock Detection**:
    - The `TableManager` checks for deadlocks at each table.
    - If a deadlock is detected, a philosopher is moved to a sixth table.
    - If the sixth table becomes full, the simulation ends.

## Running the Simulation

To run the simulation, compile and execute the `Main` class. The simulation will start, and the philosophers will begin their cycles of thinking and eating. The console output will show the actions of each philosopher and any deadlock detections.

## Example Output

```
A is thinking.
B is thinking.
C is thinking.
D is thinking.
E is thinking.
A picked up the left fork.
A picked up the right fork and is now eating.
...
Deadlock detected at table 0
A moves to the sixth table.
...
```

## Conclusion

This simulation demonstrates the Dining Philosophers problem and provides a mechanism to detect and handle deadlocks by moving philosophers to a sixth table. It showcases the use of multithreading and synchronization in Java.