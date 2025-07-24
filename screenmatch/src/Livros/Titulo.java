package Livros;

public class Titulo {
    private String titulo;
    private String autor;


    public void exibirDetalhes(){
        System.out.println(titulo);
        System.out.println(autor);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}