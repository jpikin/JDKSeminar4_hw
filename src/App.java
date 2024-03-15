import java.time.LocalDate;

public class App {


    public static void main(String[] args) {
        EmployeeDirectory employeeList = new EmployeeDirectory();

        employeeList.addEmployee(new Employee(79222035302L, "Boris", LocalDate.of(2000, 5, 15)));
        employeeList.addEmployee(new Employee(79222035303L, "Evgeniy", LocalDate.of(2008, 3, 11)));
        employeeList.addEmployee(new Employee(79222035304L, "Elena", LocalDate.of(2015, 11, 29)));
        employeeList.addEmployee(new Employee(79222035305L, "Roman", LocalDate.of(2022, 1, 28)));

        employeeList.getEmployeeByExperience(5);

        employeeList.getEmployeeByExperienceWithFilter(2);

        employeeList.getPhoneByName("Boris");


    }
}
