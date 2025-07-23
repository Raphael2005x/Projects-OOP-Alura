package AlunoMedia;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aluno {
    double soma;
    private String Name;
    private double Media;
    public double[] notas;



    public void ExibirAluno(){
        System.out.println("Nome do Aluno: " + Name);
        System.out.println("Notas do Aluno: " + soma);
        System.out.println("Media do Aluno: " + (soma / notas.length));
    }

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public double getMedia(){
        return Media;
    }
    public void getMedia(double media){
        this.Media = media;
    }
}
