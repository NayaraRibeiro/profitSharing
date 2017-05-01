package employee;

public class Analyst extends EmployeeRole implements IEmployeeRole {

    private static final String ANALYST = "Analyst";
    public static final int ANALYST_GRADE = 2;

    private final String role;

    public Analyst(String role) {
        super(role);
        this.role = role;
    }

    @Override
    public Integer getGrade() {

        if(role.equals(ANALYST))
            return ANALYST_GRADE;

        return NOT_FOUND;
    }
}
