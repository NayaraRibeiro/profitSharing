package employee;

public class Trainee extends EmployeeRole implements IEmployeeRole {

    private static final String TRAINEE = "Trainee";
    private static final int TRAINEE_GRADE = 1;

    private final String role;

    public Trainee(String role) {
        super(role);
        this.role = role;
    }

    @Override
    public Integer getGrade() {

        if (role.equals(TRAINEE)) {
            return TRAINEE_GRADE;
        }
        return NOT_FOUND;
    }
}
