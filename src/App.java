import java.time.LocalDate;

public class App {


    public static void main(String[] args) {
        EmployeeDirectory employeeList = new EmployeeDirectory();


        employeeList.addEmployee(new Employee(79222035302L, "Boris", LocalDate.of(2000, 5, 15)));
        employeeList.addEmployee(new Employee(79222035303L, "Evgeniy", LocalDate.of(2008, 3, 11)));
        employeeList.addEmployee(new Employee(79222035304L, "Elena", LocalDate.of(2015, 11, 29)));
        employeeList.addEmployee(new Employee(79222035305L, "Roman", LocalDate.of(2022, 1, 28)));

        employeeList.addEmployeeToHashMap(new Employee("Ivan", 7900433232L, LocalDate.of(2003,2,12)));
        employeeList.addEmployeeToHashMap(new Employee("Sergey", 7900433321L, LocalDate.of(2012,3,11)));
        employeeList.addEmployeeToHashMap(new Employee("Olga", 79004234323L, LocalDate.of(2023,1,28)));
        employeeList.addEmployeeToHashMap(new Employee("Tatiana", 7900443789L, LocalDate.of(2018,7,9)));


        employeeList.getEmployeeByExperience(5);

        employeeList.getEmployeeByExperienceWithFilter(2);

        employeeList.getPhoneByName("Boris");

        employeeList.getEmployeeByIdFromList(2);

        employeeList.getEmployeeByIdFromHashMap(5);



    }
}
