import domain.Client;
import domain.Employed;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employed employed = new Employed("Oscar", 500);
        System.out.println(employed.toString());

        Client client = new Client("Adrian", 'F', 25, "Cr 88", new Date(), true);
        System.out.println(client.toString());
    }
}