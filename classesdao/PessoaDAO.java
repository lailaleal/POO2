/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpetshop.classesdao;

import com.mycompany.prjpetshop.objetos.Pessoa;
import com.mycompany.prjpetshop.utilitarios.Conexao;
import com.mycompany.prjpetshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laila
 */
public class PessoaDAO {
    Connection conn;
    ManipulaData md;
    
    /*O metodo construtor e primeiro metodo a ser executado em uma classe. Esse metodo tem o mesmo nome da classe*/
    
    public PessoaDAO(){
        /*Na variavel "conn" e armazenada a conexao estabelecidade pelo metodo "conectar()" da classe "Conexao".*/
        conn = new Conexao().conectar();
        md = new ManipulaData();
    }
    
    public Pessoa salvar(Pessoa p){
        try{
            /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa(nome, cpf, data_nascimento) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getData_nascimento()));
            stmt.execute();//Executa o SQL no banco
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setIdPessoa(rs.getInt("idpessoa"));
            }
            else{
                p.setIdPessoa(-1);
            }
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }

    public void editar(Pessoa p) {

        try{
            /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */
 
            PreparedStatement stmt = conn.prepareStatement("UPDATE pessoa SET nome = ?, cpf = ?, data_nascimento =?" + "WHERE idpessoa = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setDate(3, md.string2Date(p.getData_nascimento()));
            stmt.setInt(4, (int) p.getIdpessoa());
            stmt.executeUpdate();//Executa o SQL no banco
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
   
    }
    public int excluir(Pessoa p) {

        int verif = 0;
        try{
            /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */
 
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM pessoa WHERE idpessoa = ?");
            stmt.setInt(1, (int) p.getIdpessoa());
            verif = stmt.executeUpdate();//Executa o SQL no banco
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
        return verif;
    
    }
    
    public List<Pessoa>getPessoas(){
        // É criada a variável listpessoa do tipo List que pode
        // armazenar vários objetos do tipo pessoa
         List<Pessoa> lstP = new ArrayList<>();
        // A varável rs é do tipo ResultSet, a qual armazena o retorno
        // das consultas realziadas no banco de dados.
        ResultSet rs;
        // Através do try-catch é possível tratar exceções no banco de dados
        // Caso a instrução SQL esteja incorreta ou as informações de acesso
        // ao banco de estejam erradas,será retornada uma exceção informando o erro
        try{
                  /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */
 
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa");
            //Através do executeQuery a instrução SQL de consulta é executada
            // e os valores são retornados para aplicação em um formato de "ResultSet"
            rs = ppStmt.executeQuery();
            // No comando While o ResultSet é percorrido enquanto existir
            // uma próxima informação não lida em seu interior
            while (rs.next()){
                // Na linha abaixo, através do método getpessoa os dados de pessoa
                // são extraidos do ResultSet e atribuídos para uma variável do tipo pessoa,
                // cosntituindo, dessa forma, uma pessoa x. Cada pessoa extrída pelo método getPessoa é adicionada em uma lista de pessoas, no caso, na lista
                // lstPessoa
                lstP.add(getPessoa(rs));
            }
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP;       
    }
    public List<Pessoa>getPessoas(Pessoa p){

         List<Pessoa> lstP = new ArrayList<>();
        // A varável rs é do tipo ResultSet, a qual armazena o retorno
        // das consultas realziadas no banco de dados.
        ResultSet rs;
        // Através do try-catch é possível tratar exceções no banco de dados
        // Caso a instrução SQL esteja incorreta ou as informações de acesso
        // ao banco de estejam erradas,será retornada uma exceção informando o erro
        try{
                  /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */
 
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ?");
            //Através do executeQuery a instrução SQL de consulta é executada
            // e os valores são retornados para aplicação em um formato de "ResultSet"
            ppStmt.setString(1, p.getNome()+ "%");
            rs = ppStmt.executeQuery();
            // No comando While o ResultSet é percorrido enquanto existir
            // uma próxima informação não lida em seu interior
            while (rs.next()){
                // Na linha abaixo, através do método getpessoa os dados de pessoa
                // são extraidos do ResultSet e atribuídos para uma variável do tipo pessoa,
                // cosntituindo, dessa forma, uma pessoa x. Cada pessoa extrída pelo método getPessoa é adicionada em uma lista de pessoas, no caso, na lista
                // lstPessoa
                lstP.add(getPessoa(rs));
            }
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP; 
        
    }
     public List<Pessoa> getPessoas(String nome){
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ?");
            ppStmt.setString(1,nome+ "%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP;
    }
    
    public List<Pessoa> getPessoas(String nome, String dataInicio, String dataFim){
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ? AND data_nascimento BETWEEN ? AND ?");
            ppStmt.setString(1,nome+ "%");
            ppStmt.setString(2,md.date2String(dataInicio));
            ppStmt.setString(3,md.date2String(dataFim));
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP;
    }
    
    public List<Pessoa> getPessoas(String dataInicio, String dataFim){
        List<Pessoa> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE data_nascimento BETWEEN ? AND ?");
            ppStmt.setString(1,md.date2String(dataInicio));
            ppStmt.setString(2,md.date2String(dataFim));
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lstP;
    }
    
    public Pessoa getPessoa(ResultSet rs) throws SQLException
    {
        Pessoa p = new Pessoa();
        
        p.setIdpessoa(rs.getInt("idpessoa"));
        p.setNome(rs.getString("nome"));
        p.setData(md.date2String(rs.getString("data_nascimento")));
        
        return p;
    }
    
    
    
}


