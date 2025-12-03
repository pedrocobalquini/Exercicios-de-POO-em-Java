package Operacao;

public class Operacoes {

    private int id;
    private String nome;
    private double dinheiro;

    public Operacoes(int id, String nome, double dinheiro) {
        this.id = id;
        this.nome = nome;
        depositoConta(dinheiro); //colocar a funcao e nao o saldo somente
    }

    public Operacoes(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void saqueConta(double saque){
         dinheiro -= saque + 5.00;
    }

    public void depositoConta(double deposito){
        dinheiro += deposito;
    }

    public String toString(){
        return "ID: " + id + ", " + "Nome: " + nome + ", " + "Dinheiro: " + dinheiro;
    }
}
