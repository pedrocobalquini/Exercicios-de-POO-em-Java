package entities;

public class OutsourceEmp extends Employee {
    private Double adicional;

    public OutsourceEmp(){
    }

    public OutsourceEmp(String nome, Integer horas, Double valorHora, Double adicional) {
        super(nome, horas, valorHora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    @Override
    public final double payment(){
        return super.payment() + adicional * 1.1;
    }
}

