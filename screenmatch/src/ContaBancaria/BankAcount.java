package ContaBancaria;

public class BankAcount {
    private int numeroConta;
    private double Saldo;
    private String Titular;

    public void ExibirDados(){
        System.out.println("Dados da Conta Bancaria");
        System.out.println("Titular: " + Titular);
        System.out.println("NumeroConta: " + numeroConta);
        System.out.printf( "Saldo: " + "%.2f", Saldo);

    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroconta) {
        this.numeroConta = numeroconta;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }
    public String getTitular() {
        return Titular;
    }
    public void setTitular(String titular) {
        this.Titular = titular;
    }
}

