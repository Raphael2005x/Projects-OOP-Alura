package Musica;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Passado e presente";
        musica.artista = "Mc Kevin";
        musica.anoDeLancamento = 2022;
        musica.avaliacao(5);
        musica.avaliacao(8);
        musica.avaliacao(9);
        musica.avaliacao(1);
        musica.avaliacao(4);
        musica.avaliacao(6);
        musica.avaliacao(2);
        musica.avaliacao(7);
        musica.numDeAvaliacao = musica.mediaAvaliacao();

        musica.exibeFichas();


    }
}
