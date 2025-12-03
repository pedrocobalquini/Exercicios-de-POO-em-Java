package entities;

public class UsedProduct extends Product{
    private String data;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String nome, Double price, String data) {
        super(nome, price);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public final String priceTag(){
        return super.priceTag() + "(" + data + ")";
    }
}
