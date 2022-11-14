import domain.Client;
import domain.Employed;
import domain.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int ages[] = new int[3];

        ages[0] = 10;
        System.out.println("ages[0] = " + ages[0]);

        // Runtime error
        // ages[3] = 5;

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ages " + i + ": " + ages[i]);
        }

        Person people[] = new Person[2];
        people[0] = new Person("Oscar");
        people[1] = new Person("Adrian");

        for (int i = 0; i < people.length; i++) {
            System.out.println("People " + i + ": " + people[i]);
        }

        String fruits[] = {"Orange", "Banana", "Strawberry"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruits " + i + ": " + fruits[i]);
        }

        // int numbers[][] = new int[3][2];
        int numbers[][] = {{1, 2, 3}, {1, 2, 3}};
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.println("Numbers" + row + "-" + column + ":" + numbers[row][column]);
            }
        }
    }
}