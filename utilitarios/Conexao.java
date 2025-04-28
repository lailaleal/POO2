/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpetshop.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laila
 */
public class Conexao {
    
    /*Abaixo as variáveis com as informações de acesso ao banco de dados sao declaradas.
    A palavra reservada "final" define que a variavel nao podera ser alterada em outra parte do programa. "private" define que a variavel sera
    visivel apenas na classe a qual pertence
    */
    
    final private String driver="org.postgresql.Driver";
    final private String url="jdbc:postgresql://localhost:5432/" + "bd_petshop2025";
    
    final private String usuario = "postgres";
    final private String senha = "123456";
    
    /*Atraves desse metodo sera possivel fazer a conexao com o banco de dados.*/
    
    public Connection conectar(){
        /*variavel "conn" do tipo "Connection", sendo que "Connection" e uma classe com metodos para conexao com banco de dados.*/
        
        Connection conn = null;
        
        /*Os comando "try" e "catch" sao utilizados para tratar as possiveis excecoes
        No caso da utilizacao de aplicacoes java com banco de dados ha acesso externo a aplicacao, logo o caminho de acesso externo pode ser incorreto
        o driver de acesso pode nao existir e os comandos SQL podem esrar errados*/
        
        try{
            /*Faz a leitura das classe do driver em tempo de execucao*/
            Class.forName(driver);
            /*Atraves das classes do driver e criada a conexao com banco.
            Para estabelexer a conexao e preciso definir usuario, senha e caminho onde o banco se encontra (url).
            */
            conn = DriverManager.getConnection(url, usuario, senha);
        }
        
        /*excecao caso a classe do driver nao seja encontrada*/
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        /*Excecao caso o caminho de acesso, usuario ou senha do banco estejam incorretos.*/
        catch(SQLException ex){
            ex.printStackTrace();
        }
        /*Retorna a variavel "conn" que contem a conexao com o banco de dados*/
        return conn;
    }
}
