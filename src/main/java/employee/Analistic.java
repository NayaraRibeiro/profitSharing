package employee;

public class Analistic extends EmployeeRole implements IEmployeeRole {

    public static final int ANALISTIC_GRADE = 2;
    private String role;

    public Analistic(String role) {
        super(role);
        this.role = role;
    }

    @Override
    public Integer getGrade() {

        if(role.equals(ANALISTIC))
            return ANALISTIC_GRADE;

        return NOT_FOUND;
    }
}
