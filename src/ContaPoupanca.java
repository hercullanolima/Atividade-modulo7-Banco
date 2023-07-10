public class ContaPoupanca extends Conta implements Tributavel {
    private int diaAniversario;
    private double juros;

    public ContaPoupanca(String numero, int agencia, String banco, double saldo, int chequeEspecial, int diaAniversario, double juros) {
        super(numero, agencia, banco, saldo, chequeEspecial, diaAniversario, juros);
        this.diaAniversario = diaAniversario;
        this.juros = juros;
    }

    public double getSaldo() {
        return this.saldo + this.juros * this.saldo;

    }

    @Override
    public double getImposto() {
        return 100 + 100 * juros;
    }
}