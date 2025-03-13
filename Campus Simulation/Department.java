public class Department {
    private String departmentName;
    private Person HOD;
    private Lab[] labList;

    public Department(String departmentName, Person HOD, Lab[] labList) {
        this.departmentName = departmentName;
        this.HOD = HOD;
        this.labList = labList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		sb.append("=".repeat(50)).append("\n");
        sb.append(departmentName).append("\n");
        sb.append("HOD: ").append(HOD.toString()).append("\n");
        sb.append("=".repeat(50)).append("\n");
        sb.append("Labs:\n");
        for (Lab lab : labList) {
            sb.append(lab).append("\n");
			sb.append("=".repeat(50)).append("\n");
        }
        
        return sb.toString();
    }
}
