package Filme;

import screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();

        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.printf("Media Avaliação: " + "%.2f\n", meuFilme.pegaMedia());
    }
}