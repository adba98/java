package operations;

public class Aritmetica {
    public int a;
    public int b;

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int addArguments(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return add();
    }
}
