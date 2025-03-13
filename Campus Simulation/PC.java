public class PC {
    private final String ID;
    private String generation;
    private int RAM;
    private int diskSize;

    public PC(String ID, String generation, int RAM, int diskSize) {
        this.ID = ID;
        this.generation = generation;
        this.RAM = RAM;
        this.diskSize = diskSize;
    }

    public String getID() {
        return ID;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    @Override
    public String toString() {
        return String.format("Computer Details:\nID: %s\nGeneration: %s\nRAM: %dGB\nDisk Size: %dGB\n", ID, generation, RAM, diskSize);
    }
}
