public class ParkingZone {
    private static int zoneCounter = 1;
    private String zoneID;
    private Vehicle[] vehicles = new Vehicle[5];
    private int vehicleCount = 0;

    public ParkingZone() {
        this.zoneID = "Z" + zoneCounter++;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null && vehicle.getLicensePlate() != null && vehicleCount < 5) {
            vehicles[vehicleCount++] = vehicle;
        }
    }

    public String getZoneID() {
        return zoneID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zone ID: ").append(zoneID).append(", Vehicles: [");
        for (int i = 0; i < 5; i++) {
            if (vehicles[i] != null) {
                sb.append(vehicles[i].toString());
            } else {
                sb.append("null");
            }
            if (i < 4) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}