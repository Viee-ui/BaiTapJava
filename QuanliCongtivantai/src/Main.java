import QliCtyVantai.Bicycle;
import QliCtyVantai.Motorcycle;
import QliCtyVantai.Truck;
import QliCtyVantai.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bicycle("PG Bugatti", 10));
        vehicles.add(new Motorcycle("Dream", 50));
        vehicles.add(new Truck("Hyundai", 200, 100));

        for (Vehicle vehicle : vehicles) {
            // đổ xăng
            vehicle.refuel(10);

            // di chuyển 50km
            vehicle.move(50);

            // xuất thông tin
            vehicle.displayInfo();

            System.out.println();

        }
    }
}