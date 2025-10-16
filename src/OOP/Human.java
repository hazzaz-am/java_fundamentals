package OOP;

public class Human {
    static long population;
    String name;
    int age;
    int salary;

    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population = 70000000;
    }
}