public class Lab {
    private String labName;
    private String labStaffName;
    private int numOfPCs;
    private PC[] pcList;

    public Lab(String labName, String labStaffName, int numOfPCs, PC[] pcList) {
        this.labName = labName;
        this.labStaffName = labStaffName;
        this.numOfPCs = numOfPCs;
        this.pcList = pcList;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabStaffName() {
        return labStaffName;
    }

    public void setLabStaffName(String labStaffName) {
        this.labStaffName = labStaffName;
    }

    public int getNumOfPCs() {
        return numOfPCs;
    }

    public void setNumOfPCs(int numOfPCs) {
        this.numOfPCs = numOfPCs;
    }

    public PC[] getPCList() {
        return pcList;
    }

    public void setPCList(PC[] pcList) {
        this.pcList = pcList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=".repeat(50)).append("\n");
        sb.append("Lab Name: ").append(labName).append("\n");
        sb.append("Lab Staff Name: ").append(labStaffName).append("\n");
        sb.append("Number of PCs: ").append(numOfPCs).append("\n");
        sb.append("=".repeat(50)).append("\n");
        sb.append("PCs in this lab:\n");
        for (PC pc : pcList) {
            sb.append("\t").append(pc).append("\n");
			sb.append("=".repeat(50)).append("\n");
        }
        
        return sb.toString();
    }
}
