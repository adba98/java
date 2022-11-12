package domain;

public class Persona {
    private String name;
    private double salary;
    private boolean removed;
    private int id;
    private static int counterPerson;

    public Persona(String name, double salary, boolean removed) {
        this.name = name;
        this.salary = salary;
        this.removed = removed;
        Persona.counterPerson++;
        this.id = Persona.counterPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona {" +
                " name='" + name + '\'' +
                ", salary=" + salary +
                ", removed=" + removed +
                ", id=" + id +
                " }";
    }
}
