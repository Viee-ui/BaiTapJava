package QliCtyVantai;

public class Truck extends AbstractVehicle{
    private double fuelCost;
    private double weight;

    public Truck(String name, double baseMaintenanceCost, double weight) {
        super(name, baseMaintenanceCost);
        this.weight = weight;
    }

    @Override
    public void move(int distance) {
        if ( fuelCost >= (distance*0.2 + weight*0.02) ) {
            super.move(distance);
            fuelCost -= distance*0.2 + weight*0.02;
            System.out.println("Fuel cost after move: " + fuelCost);
        }else {
            System.out.println("NOT MOVE, DISTANCE: " + distance + "(km), FUEL COST: " + fuelCost);
        }
    }

    @Override
    double calculateFuelCost() {
        return mileage*0.2 + weight*0.02;
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public double calculateMaintenanceCost() {
        return baseMaintenanceCost + calculateFuelCost() + weight*0.1;
    }

    @Override
    public void refuel(double amount) {
        fuelCost += amount;
        System.out.println("Refueling " + amount + ", fuel cost: " + fuelCost);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total maintenance cost: " + calculateMaintenanceCost());
    }
}
