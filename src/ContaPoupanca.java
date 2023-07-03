public class ContaPoupanca extends Conta implements Tributavel{
    private  int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(String numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }
    public double getSaldo(){
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

    @Override
    public double getImposto(){
        return 100 + 100 * taxaDeJuros;
    }
}
