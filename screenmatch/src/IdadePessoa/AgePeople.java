package IdadePessoa;

public class AgePeople {
    private String nome;
    private int Idade;

    public void exibirResultados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + Idade);
        if(Idade <= 17){
            System.out.println("Menor De Idade");
        }
        else{
            System.out.println("Maior De Idade");
        }
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
}
