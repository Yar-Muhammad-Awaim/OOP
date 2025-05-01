public class ParkingSystem {
    private static ParkingSystem instance;
    private String campusName;
    private Supervisor supervisor;
    private ParkingZone[] parkingZones = new ParkingZone[2];
    private PermitHolder[] permitHolders = new PermitHolder[2];
    private int zoneCount = 0;
    private int permitHolderCount = 0;

    private ParkingSystem() {}

    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem();
            instance.campusName = campusName;
            instance.supervisor = supervisor;
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone parkingZone) {
        if (zoneCount < 2) {
            parkingZones[zoneCount++] = parkingZone;
        }
    }

    public void addPermitHolder(PermitHolder permitHolder) {
        if (permitHolderCount < 2) {
            permitHolders[permitHolderCount++] = permitHolder;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus: ").append(campusName).append("\n");
        sb.append("Supervisor: ").append(supervisor.toString()).append("\n");
        sb.append("Zones:\n");
        for (ParkingZone zone : parkingZones) {
            if (zone != null) {
                sb.append(zone.toString()).append("\n");
            }
        }
        sb.append("Permit Holders:\n");
        for (PermitHolder ph : permitHolders) {
            if (ph != null) {
                sb.append(ph.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}