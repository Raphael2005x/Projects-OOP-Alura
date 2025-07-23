package Carros;

public class PrincipalCarros {
    public static void main(String[] args) {
        Carros meuCarro = new Carros();

        meuCarro.Modelo = "Gol";
        meuCarro.Ano = 2020;
        meuCarro.Cor = "Preto";
        meuCarro.AnoAtual = meuCarro.calcularIdadeCarro();

        meuCarro.exibirDados();
    }
}
