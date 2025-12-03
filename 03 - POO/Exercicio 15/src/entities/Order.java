package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> pedidos = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getData() {
        return moment;
    }

    public void setData(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getPedidos() {
        return pedidos;
    }

    public void addPedidos(OrderItem pedido){
        pedidos.add(pedido);
    }

    public void removePedidos(OrderItem pedido){
        pedidos.remove(pedido); //cuidar isso e anotar
    }

    //possivel erro aqui
    public Double total(){
        double tot = 0.0;
        for (OrderItem pedido : pedidos){
            tot += pedido.subTotal(); //erro no +=
        }
        return tot;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nOrder moment: " + moment);
        sb.append("\nOrder status: " + status);
        sb.append("\n" + client);
        for (OrderItem item : pedidos) {
            sb.append("\n" + item);
        }
        sb.append("\nTotal da compra: " + total());
        return sb.toString();
    }


}

