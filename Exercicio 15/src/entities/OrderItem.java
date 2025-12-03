package entities;

public class OrderItem {

    private Integer quantidade;
    private Double preco;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantidade, Double preco, Product product) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.product = product;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return preco * quantidade;
    }

    public String toString(){
        return product.getNome() + ", " + preco + ", " + quantidade; //erro no get
    }
}
