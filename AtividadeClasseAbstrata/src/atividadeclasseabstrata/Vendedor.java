package atividadeclasseabstrata;

/**
 *
 * @author Julli
 */
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(double comissao, String nome, String setor, int cadastro, double salario) {
        super(nome, setor, cadastro, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("VENDEDOR:\nNome: "+super.getNome()+"\nSetor: "+super.getSetor()+"\nCadastro: "+super.getCadastro()+"\nSalario: R$ "+super.getSalario()+"\nComissao: R$"+this.getComissao());  
    }

    @Override
    public void simularBeneficio() {
        double beneficio;
        
        beneficio = super.getSalario() * 1.20;
        
        System.out.println("Beneficio Simulado: R$"+beneficio+"\n");
    }
    
    
}
