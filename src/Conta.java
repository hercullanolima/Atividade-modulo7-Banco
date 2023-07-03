public abstract class Conta  implements Tributavel{
    protected String numero;
    protected int agencia;
    protected String banco;
    protected double saldo;


    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor) {
    }

    public void depositar(double valor) {
    }
}
