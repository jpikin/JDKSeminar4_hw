import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeDirectory {

    private List<Employee> employeeList = new ArrayList<>();
    private HashMap<Integer, Employee> employeeHashMap = new HashMap<>();

    public void addEmployee(Employee e) {
        this.employeeList.add(e);
    }

    public void addEmployeeToHashMap(Employee employee) {
        this.employeeHashMap.put(employee.setID(), employee);
    }

    /**
     * Метод получает год и выводит в консоль всех сотрудников,
     * чей стаж равен или меньше запрашиваемому году.
     *
     * @param year Год, по которому происходит поиск
     */
    public void getEmployeeByExperience(int year) {
        boolean check = false;
        for (Employee e : this.employeeList) {
            if (e.getWorkExperience() <= year) {
                check = true;
                System.out.println(e);
            }
        }
        if (!check) System.out.println("Сотрудников с заданным стажем не найдено");
    }

    /**
     * Метод выводит в консоль сотрудников, с совпадающим стажем работы.
     *
     * @param year год, с которым сравнивается стаж работы сотрудника.
     */
    public void getEmployeeByExperienceWithFilter(int year) {
        List<Employee> returnList = employeeList.stream()
                .filter(employee -> employee.getWorkExperience() == year).toList();
        for (Employee e : returnList) {
            System.out.println(e);
        }
    }

    /**
     * Метод получает имя и выводит в консоль имя и телефон сотрудника.
     *
     * @param name Имя сотрудника
     */
    public void getPhoneByName(String name) {
        boolean check = false;
        for (Employee e : this.employeeList) {
            if (e.getname().contains(name)) {
                check = true;
                System.out.printf("Сотрудник %s: %d", e.getname(), e.getPhoneNumber());
            }
        }
        if (!check) System.out.printf("Сотрудников с именем %s не найдено", name);
    }

    public void getEmployeeByIdFromList(int id) {
        List<Employee> returnList = this.employeeList.stream()
                .filter(employee -> employee.getId() == id).toList();
        for (Employee e : returnList) {
            System.out.println(e);
        }
    }

    public void getEmployeeByIdFromHashMap(int id) {
        System.out.println((this.employeeHashMap.get(id) != null)
                ? this.employeeHashMap.get(id)
                : "С таким ID сотрудников не найдено");
    }
}
