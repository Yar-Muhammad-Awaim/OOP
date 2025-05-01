public class Vehicle {
    private static java.util.List<String> licensePlates = new java.util.ArrayList<>();
    private String licensePlate;
    private String vehicleType;
    private Owner owner;

    public Vehicle(String licensePlate, String vehicleType, Owner owner) {
        if (licensePlates.contains(licensePlate)) {
            System.out.println("Error: Duplicate license plate '" + licensePlate + "' is not allowed.");
            this.licensePlate = null;
            this.vehicleType = null;
            this.owner = null;
        } else {
            this.licensePlate = licensePlate;
            this.vehicleType = vehicleType;
            this.owner = owner;
            licensePlates.add(licensePlate);
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Vehicle shallowCopy() {
        return new Vehicle(this.licensePlate, this.vehicleType, this.owner);
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(this.owner.getName());
        return new Vehicle(this.licensePlate, this.vehicleType, newOwner);
    }

    @Override
    public String toString() {
        if (licensePlate == null) {
            return "license plate: null, type: null, owner: [null]";
        }
        return "license plate: " + licensePlate + ", type: " + vehicleType + ", owner: [" + owner.toString() + "]";
    }
}
