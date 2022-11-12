import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: ");
        Scanner console = new Scanner(System.in);
        var user = console.nextLine();
        System.out.println("Hello " + user);
    }
}