package QliCtyVantai;


public class Motorcycle extends AbstractVehicle {
    private double fuelCost;

    public Motorcycle(String name, double baseMaintenanceCost) {
        super(name, baseMaintenanceCost);
    }

    @Override
    public void move(int distance) {
        if (fuelCost >= distance * 0.1) {
            super.move(distance);
            fuelCost -= distance * 0.1;
            System.out.println("Fuel cost after move: " + fuelCost);
        }else {
            System.out.println("NOT MOVE, DISTANCE: " + distance + "(km), FUEL COST: " + fuelCost);
        }

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total maintenance cost: " + calculateMaintenanceCost());
    }

    @Override
    double calculateFuelCost() {
        return mileage * 0.1;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public double calculateMaintenanceCost() {
        return baseMaintenanceCost + calculateFuelCost() + fuelCost;
    }

    @Override
    public void refuel(double amount) {
        fuelCost += amount;
        System.out.println("REFUELING " + amount + ", FUEL COST: " + fuelCost);
    }
}
