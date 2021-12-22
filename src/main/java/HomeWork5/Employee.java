package HomeWork5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(
            String fullName,
            String position,
            String email,
            String phoneNumber,
            int salary,
            int age
    ) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %s\n" +
                "Должность: %s\n" +
                "Электронная почта: %s\n" +
                "Номер телефона: %s\n" +
                "Зарплата: %d\n" +
                "Возраст: %d",
                fullName, position, email, phoneNumber, salary, age);
    }
}
