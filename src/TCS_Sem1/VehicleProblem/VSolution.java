package TCS_Sem1.VehicleProblem;

import java.util.Scanner;


public class VSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++)
            vehicles[i] = new Vehicle(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
//        for (int i = 0; i < n; i++)
//            System.out.println(vehicles[i].toString());
        String vehicleFuelType = scanner.next();
        Vehicle[] result = getResultVehicle(vehicles, vehicleFuelType);
        for (Vehicle v : result)
            System.out.println(v.toString());
    }

    private static Vehicle[] getResultVehicle(Vehicle[] vehicles, String vehicleFuelType) {
        int size = 0, j = 0;

        for (Vehicle vehicle1 : vehicles) if (vehicle1.getFuelType().equals(vehicleFuelType)) size++;

        Vehicle[] vehicle = new Vehicle[size];

        for (Vehicle vehicle1 : vehicles)
            if (vehicle1.getFuelType().equals(vehicleFuelType)) {
                vehicle[j] = vehicle1;
                j++;
            }

        Vehicle temp;

        for (int i = 0; i < size; i++)
            for (j = i + 1; j < size - 1; j++)
                if (vehicle[i].getMileage() < vehicle[j].getMileage()) {
                    //swap
                    temp = vehicle[i];
                    vehicle[i] = vehicle[j];
                    vehicle[j] = temp;
                }
        return vehicle;
    }
}
/*
aaa petrol 10 100
bbb diesel 20 200
ccc petrol 15 150
ddd diesel 30 220
petrol
 */
