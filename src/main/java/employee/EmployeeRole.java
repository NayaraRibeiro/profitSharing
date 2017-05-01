package employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class EmployeeRole {
    private static final String EMPLOYEE_ROLE_TYPE_NOT_FOUND = "Employee role type not found.";
    private static final String PACKAGE_NAME = "employee.";
    protected static final String TRAINEE = "Trainee";
    protected static final String ANALYST = "Analyst";
    protected static final String MANAGER = "Manager";
    private final String role;

    public EmployeeRole(String role) {
        this.role = role;
    }

    public IEmployeeRole getInstance() {
        try {
            Class<?> clazz = Class.forName(PACKAGE_NAME + role);
            Constructor<?> constructor = clazz.getConstructor(String.class);
            return  (IEmployeeRole) constructor.newInstance(role);

        } catch (InstantiationException| IllegalAccessException| InvocationTargetException| NoSuchMethodException | ClassNotFoundException e) {
            System.out.print(EMPLOYEE_ROLE_TYPE_NOT_FOUND);
        }
        return null;
    }
}
