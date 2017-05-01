package employee;

public class Manager extends EmployeeRole implements IEmployeeRole{

    private static final String MANAGER = "Manager";
    private static final int MANAGER_GRADE = 3;

    private final String role;

    public Manager(String role) {
        super(role);
        this.role = role;
    }

    @Override
    public Integer getGrade() {

        if(role.equals(MANAGER))
            return MANAGER_GRADE;

        return NOT_FOUND;
    }
}
