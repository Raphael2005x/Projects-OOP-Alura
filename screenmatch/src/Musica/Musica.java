package Musica;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numDeAvaliacao;

    void exibeFichas(){
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Totao De avaliações: " + avaliacao);
        System.out.printf("Media de avaliação: "+ "%.2f\n", numDeAvaliacao);

    }
    void avaliacao(double nota){
        avaliacao += nota;
        numDeAvaliacao++;
    }
    double mediaAvaliacao(){
        return avaliacao / numDeAvaliacao;

    }
}
