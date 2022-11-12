package domain;

public class Persona {
    private String name;
    private double salary;
    private boolean removed;

    public Persona(String name, double salary, boolean removed) {
        this.name = name;
        this.salary = salary;
        this.removed = removed;
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

    @Override
    public String toString() {
        return "Persona {" +
                " name='" + name + '\'' +
                ", salary=" + salary +
                ", removed=" + removed +
                " }";
    }
}
