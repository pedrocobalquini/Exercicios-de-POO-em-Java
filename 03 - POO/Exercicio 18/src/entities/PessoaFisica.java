package entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public double calculoImposto() {
        if (super.getRendaAnual() < 20000){
            return super.getRendaAnual() * 0.15 - (gastosSaude * 0.50);
        }
        else {
            return super.getRendaAnual() * 0.25 - (gastosSaude * 0.50);
        }
    }
}
