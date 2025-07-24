package Calculadora;

public class RetornoCalculadora {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        calcular.receberEntrada();
        calcular.calculo();
        System.out.println(calcular.calculo());
    }
}
