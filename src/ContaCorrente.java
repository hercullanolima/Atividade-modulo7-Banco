public class ContaCorrente extends Conta implements Tributavel {
    private double chequeEspecial;

    public ContaCorrente(String numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }


    @Override
    public double getImposto(){
        return 150;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }


}
