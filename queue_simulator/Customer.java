public class Customer {
    private long arrivalTime;
    private int serviceTime;
    private boolean served;

    public Customer(long arrivalTime, int serviceTime) {
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.served = false;
    }

    // Getters and setters
    public long getArrivalTime() { return arrivalTime; }
    public int getServiceTime() { return serviceTime; }
    public boolean isServed() { return served; }
    public void setServed(boolean served) { this.served = served; }
}