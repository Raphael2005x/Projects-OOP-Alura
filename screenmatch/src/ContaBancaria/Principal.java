package ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        BankAcount info = new BankAcount();


        info.setTitular("Raphael");
        info.setNumeroConta(238529232);
        info.setSaldo(5000);
        info.ExibirDados();
    }
}