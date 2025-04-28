/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpetshop.classesdao;
import com.mycompany.prjpetshop.objetos.Pet;
import com.mycompany.prjpetshop.utilitarios.Conexao;
import com.mycompany.prjpetshop.utilitarios.ManipulaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author laila
 */
public class PetDAO {
    Connection conn;
    ManipulaData md;
    
    public PetDAO(){
        /*Na variavel "conn" e armazenada a conexao estabelecidade pelo metodo "conectar()" da classe "Conexao".*/
        conn = new Conexao().conectar();
        md = new ManipulaData();
    }
    public Pet salvar(Pet p){
        try{
            /*Estabelece um espaco para "preparar" o SQL que sera executado no banco. Cada simbolo "?" sera subtituido por valores contidos em variaveis de uma classe java.
            Atraves dos metodos set da classe PreparedStatement sao atribuidos valores para os espacos referentes aos simbolos "?"
            */
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pet(nome, especie, raca, porte, cor, data_nascimento) values(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEspecie());
            stmt.setString(3, p.getRaca());
            stmt.setString(4, p.getPorte());
            stmt.setString(5, p.getCor());
            stmt.setDate(6, md.string2Date(p.getData_nascimento()));
            stmt.execute();//Executa o SQL no banco
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setIdPet(rs.getInt("idpet"));
            }
            else{
                p.setIdPet(-1);
            }
            
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
}
