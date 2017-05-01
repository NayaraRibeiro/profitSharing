package employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class EmployeeRole {
    private static final String EMPLOYEE_ROLE_TYPE_NOT_FOUND = "Employee role type not found.";
    private static final String PACKAGE_NAME = "employee.";

    private final String role;

    public EmployeeRole(String role) {
        this.role = role;
    }

    public IEmployeeRole getInstance() throws ClassNotFoundException {
        try {
            Class<?> clazz = Class.forName(PACKAGE_NAME + role);
            Constructor<?> constructor = clazz.getConstructor(String.class);
            return  (IEmployeeRole) constructor.newInstance(role);

        } catch (InstantiationException| IllegalAccessException| InvocationTargetException| NoSuchMethodException | ClassNotFoundException e) {
            System.out.print(EMPLOYEE_ROLE_TYPE_NOT_FOUND);
            throw new ClassNotFoundException();
        }
    }
}
