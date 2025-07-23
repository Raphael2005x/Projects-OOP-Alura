package Filme;

public class Filmes {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private int totalDeAvaliacao;
    private double somaDasAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Nome do fiche: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getTotalDeAvaliacao() {
        return this.totalDeAvaliacao;
    }
}
