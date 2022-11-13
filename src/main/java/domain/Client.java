package domain;

import java.util.Date;

public class Client extends Person {
    private int id;
    private Date registrationDate;
    private boolean vip;
    private static int counterClient;

    public Client(String name, char gender, int age, String address, Date registrationDate, boolean vip) {
        super(name, gender, age, address);
        this.id = ++Client.counterClient;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", registrationDate=" + registrationDate +
                ", vip=" + vip +
                ", " + super.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
