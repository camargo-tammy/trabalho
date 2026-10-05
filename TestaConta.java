public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Alex", 1000.0);

        c1.depositar(500.0);
        c1.sacar(200.0);

        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo: " + c1.getSaldo());
    }
}