import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee[] generateEmployees(int count) {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            int type = random.nextInt(2);
            int age = random.nextInt(18, 75);
            switch (type) {
                case 0:
                    int salary = random.nextInt(60000, 120001);
                    employees[i] = Worker.create(
                            surnames[random.nextInt(surnames.length)],
                            names[random.nextInt(names.length)],
                            salary, age);
                    break;
                default:
                    salary = random.nextInt(400, 801);
                    employees[i] = Freelancer.create(
                            surnames[random.nextInt(surnames.length)],
                            names[random.nextInt(names.length)],
                            salary, age);
                    break;
            }
        }
        return employees;
    }


}
