package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, Double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoSalario(double percent){
        salario += salario * (percent /100);
    }

    public String toString(){
        return id + ", " + nome + ", " + salario;
    }
}
