package equipecalc;

public class Main {

    public static void main(String[] args) {

        Calc c = new Calc();

        System.out.println("2 + 3 = " + c.soma(2, 3));
        System.out.println("3 - 2 = " + c.subtracao(3, 2));
        System.out.println("2 * 3 = " + c.multiplicacao(2, 3));
    }
}