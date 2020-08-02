package geekbrains.hw_1_5;

public class Main {

    public static void main(String[] args) {

//    Employee employee1 = new Employee();              // Здесь пробовал без конструктора;
//
//    employee1.fullName = "Ivanov Ivan Ivanovich";
//    employee1.position = "Engineer";
//    employee1.eMail = "Ivanych@mail.ru";
//    employee1.phone = "89123456789";
//    employee1.salary = 90000;
//    employee1.age = 27;

    Employee employee2 = new Employee("Petrov Petr Petrovich", "Senior engineer", "Petrovich@gmail.com", "89187654321", 130000, 86);

//    employee1.info();                                 // Печать без конструктора;
    employee2.info();

    Employee[] employees = new Employee[5];             // Создан массив из 5 сотрудников;
    employees[0] = new Employee("Petrov Petr Petrovich", "Senior engineer", "Petrovich@gmail.com", "89187654321", 130000, 48);
    employees[1] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "Ivanych@mail.ru", "89123456789", 90000, 27);
    employees[2] = new Employee("Ilyin Ilya Ilyich", "Programmer", "Ilyich@gmail.com", "89187853721", 150000, 32);
    employees[3] = new Employee("Mishin Mikhail Mikhailovich", "Economist", "Mikhailovich@bk.ru", "89582654329", 180000, 41);
    employees[4] = new Employee("Stepanov Stepan Stepanovich", "Director", "Stepanovich@gmail.com", "89198417321", 250000, 32);

    System.out.println("*** Employees over 40 years of age: ***\n");

        for (int i = 0; i < employees.length ; i++) {   // С помощью цикла выводим информацию только о сотрудниках старше 40 лет;
            if (employees[i].age > 40) {
                employees[i].info();
            }
        }
    }
}
