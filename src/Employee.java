import java.time.LocalDate;
import java.time.Period;


public class Employee {
    private static int ID = 0;
    private int id;
    private final String name;
    private long phoneNumber;
    private final LocalDate dateOfEmployment;

    public Employee(long phone, String name, LocalDate date) {
        this.id = ID++;
        this.phoneNumber = phone;
        this.name = name;
        this.dateOfEmployment = date;
    }
    public Employee(String name, long phone, LocalDate date){
        this.phoneNumber = phone;
        this.name = name;
        this.dateOfEmployment = date;
    }

    /**
     * Метод вычисляет трудовой стаж вычитая из текущей даты дату трудоустройства.
     * @return возвращаем количество лет стажа
     */
    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.dateOfEmployment, currentDate);
        return period.getYears();
    }

    public String getname() {
        return this.name;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getId() {
        return this.id;
    }
    public int setID(){
        return ID++;
    }

    @Override
    public String toString() {
        return "Сотрудник " + this.name + "\n"
                + "ID " + this.id + "\n"
                + "Телефон " + this.phoneNumber + "\n"
                + "Стаж " + getWorkExperience() + "\n";
    }
}
