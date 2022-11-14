package domain;

public class Employed extends Person {
    private int id;
    private int salary;
    private static int counterEmployed;

    public Employed() {
        this.id = ++Employed.counterEmployed;
    }

    public Employed(String name, int salary) {
        // super(name);
        this();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employed{" +
                "id=" + id +
                ", salary=" + salary +
                ", " + super.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounterEmployed() {
        return counterEmployed;
    }

    public static void setCounterEmployed(int counterEmployed) {
        Employed.counterEmployed = counterEmployed;
    }
}
