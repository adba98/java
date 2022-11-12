import domain.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("oscar", 5000, false);
        System.out.println(persona.toString());
        persona.setName("Oscar Adrian");
        System.out.println(persona.toString());
    }
}