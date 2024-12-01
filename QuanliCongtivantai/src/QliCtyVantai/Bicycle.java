package QliCtyVantai;

public class Bicycle extends AbstractVehicle{
    // ko có thuộc tính

    public Bicycle(String name, double baseMaintenanceCost) {
        super(name, baseMaintenanceCost);
    }

    @Override
    public String getType() {
        return "Bicycle";
    }

    @Override
    public void move(int distance) {
        super.move(distance);
    }

    @Override
    double calculateFuelCost() {
        return 0;
    }

    @Override
    public double calculateMaintenanceCost() {
        return super.baseMaintenanceCost += 20;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total maintenance cost: " + calculateMaintenanceCost());
    }

    @Override
    public void refuel(double amount) {
        //
    }
}
