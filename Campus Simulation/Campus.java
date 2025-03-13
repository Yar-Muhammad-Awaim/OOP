public class Campus {
    private String campusName;
    private String directorName;
    private String campusAddress;
    private Department[] departmentList;

    public Campus(String campusName, String directorName, String campusAddress, Department[] departmentList) {
        this.campusName = campusName;
        this.directorName = directorName;
        this.campusAddress = campusAddress;
        this.departmentList = departmentList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		sb.append("=".repeat(50)).append("\n");
        sb.append("Campus Name: ").append(campusName).append("\n");
        sb.append("Campus Director: ").append(directorName).append("\n");
        sb.append("Campus Address: ").append(campusAddress).append("\n");

        sb.append("Departments:\n");
        for (Department department : departmentList) {
            sb.append(department).append("\n");
        }

        return sb.toString();
    }
}
