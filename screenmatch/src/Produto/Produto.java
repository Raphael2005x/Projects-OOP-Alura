package Produto;

public class Produto {
    private String Name;
    private double Price;
    private double Discount = 5;

    public void ExibirProdutos(){
        System.out.println("Product:: " + Name);
        System.out.printf("Price: " + "R$ "+ "%.2f\n", Price);

        Discount = (Discount / 100) * Price;
        System.out.printf( "Discount: " + "%.2f\n", Discount);
        System.out.printf("Final Price: " + "%.2f\n", (Price - Discount));
    }

    public double GetPrice(){
        return Price;
    }
    public void setPrice(double price){
        Price = price;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
}
