package Calcualdora;

import java.util.Scanner;

public class Calculadora {
    Scanner reader;
    int numero;

    void receberEntrada(){
        reader = new Scanner(System.in);
        numero = reader.nextInt();
    }
    int calculo(){
       return numero * 2;
    }
}
