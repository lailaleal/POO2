package atividadeclasseabstrata;

/**
 *
 * @author Julli
 */
public class Gerente extends Funcionario{
    private double beneficioExtra;

    public Gerente(double beneficioExtra, String nome, String setor, int cadastro, double salario) {
        super(nome, setor, cadastro, salario);
        this.beneficioExtra = beneficioExtra;
    }

    public double getBeneficioExtra() {
        return beneficioExtra;
    }

    public void setBeneficioExtra(double beneficioExtra) {
        this.beneficioExtra = beneficioExtra;
    }

    @Override
    public void imprimirInformacoes() {
         System.out.println("GERENTE:\nNome: "+super.getNome()+"\nSetor: "+super.getSetor()+"\nCadastro: "+super.getCadastro()+"\nSalario: R$ "+super.getSalario()+"Beneficio Extra: R$"+this.getBeneficioExtra());  
    }

    @Override
    public void simularBeneficio() {
        double beneficio;
        
        beneficio = super.getSalario() * 1.25;
        
        System.out.println("Beneficio Simulado: R$"+beneficio+"\n");
    }
    
    
}
