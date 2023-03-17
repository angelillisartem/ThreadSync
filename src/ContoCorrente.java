public class ContoCorrente {
    public int saldo;

    public ContoCorrente(int saldo) {
        this.saldo = saldo;
    }

    public void versa(int somma) {
        saldo += somma;
    }

    public void stampaSaldo() {
        saldo -= 100;
        System.out.print("\nHai un saldo di: " + saldo);
    }
}
