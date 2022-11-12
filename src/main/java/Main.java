import domain.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Oscar", 5000, false);
        print(persona);

        Persona persona2 = new Persona("Adrian", 3000, false);
        print(persona2);
    }

    public static void print(Persona persona) {
        System.out.println("persona = " + persona);
    }
}