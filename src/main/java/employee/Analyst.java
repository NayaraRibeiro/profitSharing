package employee;

public class Analyst extends EmployeeRole implements IEmployeeRole {

    public static final int ANALYST_GRADE = 2;
    private String role;

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
