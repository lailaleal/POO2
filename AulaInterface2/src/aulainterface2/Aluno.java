package aulainterface2;

import java.util.ArrayList;

public class Aluno implements DAO
{

    private String nome;
    private String RA;
    private String curso;
    
        
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", RA=" + RA + ", curso=" + curso + '}';
    }

    @Override
    public void salvar() {
        System.out.println("Salvando");
    }

    @Override
    public void selecionar() {
        System.out.println("Listando");
    }

    @Override
    public void deletar() {
        System.out.println("deletando");
    }

    @Override
    public void alterar() {
        System.out.println("alterando");
    }
      
}
