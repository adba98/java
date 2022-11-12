import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (var counter = 0; counter < 5; counter++) {
            if (counter % 2 != 0) {
                break;
            }
            System.out.println("counter = " + counter);
        }

        for (var counter = 0; counter < 5; counter++) {
            if (counter % 2 != 0) {
                continue;
            }
            System.out.println("counter = " + counter);
        }
    }
}