package QliCtyVantai;


public interface Vehicle {

    String getType();

    double calculateMaintenanceCost();

    void displayInfo();

    void move(int distance);

    void refuel(double amount);

}
