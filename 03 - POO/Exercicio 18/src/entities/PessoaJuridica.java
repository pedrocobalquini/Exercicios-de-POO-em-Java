package entities;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) { //entender isso
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    @Override
    public double calculoImposto() {
        if (numeroFuncionarios > 10){
            return super.getRendaAnual() * 0.14;
        }
        else {
            return super.getRendaAnual() * 0.16;
        }
    }
}
