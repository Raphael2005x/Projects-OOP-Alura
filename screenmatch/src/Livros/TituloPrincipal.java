package Livros;

import java.util.Scanner;

public class TituloPrincipal {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o nome do titulo: ");
        titulo.setTitulo("Titulo: "+reader.nextLine());
        System.out.println("Digite o nome do Autor: : ");
        titulo.setAutor("Autor: " + reader.nextLine());
        titulo.exibirDetalhes();
    }
}