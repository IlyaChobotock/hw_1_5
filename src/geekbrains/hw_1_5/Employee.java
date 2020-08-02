package geekbrains.hw_1_5;

public class Employee {             // Создан класс "Сотрудник";

    String fullName;                // Созданы требуемые поля;
    String position;
    String eMail;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String position, String eMail, String phone, int salary, int age) {    // Создан конструктор через Alt + Insert;
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {            // Внутри класса "Сотрудник" создан метод, который выводит информацию об объекте в консоль;
        System.out.printf(" fullName %s%n position %s%n eMail %s%n phone %s%n salary %s%n age %d %n%n", fullName, position, eMail, phone, salary, age);
    }
}
