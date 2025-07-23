package Carros;

public class Carros {
    String Modelo;
    String Cor;
    int Ano;
    int AnoAtual = 2025;

    void exibirDados() {
        System.out.println("Modelo: " + Modelo);
        System.out.println("Cor: " + Cor);
        System.out.println("Ano: " + Ano);
        System.out.println("Idade do carro: " + AnoAtual + " ano(s)");

    }
    int calcularIdadeCarro(){
        return AnoAtual - Ano;
    }
}
