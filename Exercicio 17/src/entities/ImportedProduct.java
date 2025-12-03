package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String nome, Double price, Double customsFee) {
        super(nome, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public final String priceTag(){
        return totalPrice() + "(" + customsFee + ")";
    }
}
