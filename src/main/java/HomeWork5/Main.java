package HomeWork5;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Королёва Эдита Геннадиевна", "Нанотехнолог", "korolyov@mail.ru", "001", 30000, 30);
        employees[1] = new Employee("Маркова Франсуаза Глебовна", "Кассир", "markova@mail.ru", "002", 35000, 35);
        employees[2] = new Employee("Журавлёв Альфред Всеволодович", "Менеджер по продажам", "zhooravlyov@mail.ru", "003", 40000, 40);
        employees[3] = new Employee("Гаврилов Рубен Федорович", "Водитель", "gavrilov@mail.ru", "004", 45000, 45);
        employees[4] = new Employee("Борисов Соломон Семенович", "Бармен", "borisov@mail.ru", "005", 50000, 50);

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
                System.out.println("\n");
            }
        }

    }

}
