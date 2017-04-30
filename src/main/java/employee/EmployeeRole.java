package employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class EmployeeRole {
    public static final String TRAINEE = "Trainee";
    public static final String ANALISTIC = "Analistic";
    public static final String MANAGER = "Manager";
    private String role;

    public EmployeeRole(String role) {
        this.role = role;
    }

    public IEmployeeRole getInstance() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName("employee." + role);
        Constructor<?> constructor = clazz.getConstructor(String.class);
        return  (IEmployeeRole) constructor.newInstance(role);
    }
}
