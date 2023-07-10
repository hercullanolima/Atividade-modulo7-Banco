public class ContaCorrente extends Conta implements Tributavel{
    private int chequeEspecial;

    public ContaCorrente(String numero, int agencia, String banco, double saldo, int chequeEspecial) {
        super(numero, agencia, banco, saldo, chequeEspecial);
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getchequeEspecial(){
        return this.chequeEspecial;
    }

    public double getChequeEspecial(){
        return this.chequeEspecial;
    }


    @Override
    public double getImposto() {
        return this.saldo* 0.02;
    }

}
