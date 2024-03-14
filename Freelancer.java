/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    private Freelancer(String surName, String name, double salary, int age){
        super(surName, name, salary, age);
    }
    public static Freelancer create(String surName, String name, double salary, int age){
        return new Freelancer(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }


}


