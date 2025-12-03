package entities;

public class Employee {
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Employee() {
    }

    public Employee(String nome, Integer horas, Double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public double payment(){
        return valorHora * horas;
    }
}

