package atividadeclasseabstrata;

/**
 *
 * @author Jullia
 */
public abstract class Funcionario {
    private String nome, setor;
    private int cadastro;
    private double salario;

    public Funcionario(String nome, String setor, int cadastro, double salario) {
        
        if(nome.equals(" ")){
            this.nome = "Nome nao informado.";
        }else{
            this.nome = nome;
        }
         
        this.setor = setor;
        this.cadastro = cadastro;
        
        if(salario < 1412){
            this.salario = 1412.00;
        }else{
            this.salario = salario;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public abstract void imprimirInformacoes();
    
    public abstract void simularBeneficio();
    
    
}
