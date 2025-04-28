/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpetshop.classesbo;

import com.mycompany.prjpetshop.classesdao.PessoaDAO;
import com.mycompany.prjpetshop.objetos.Pessoa;
import java.util.List;

/**
 *
 * @author laila
 */
public class PessoaBO {
    PessoaDAO pDAO;
    
    public PessoaBO(){
        pDAO = new PessoaDAO();
    }
    
    public Pessoa salvar(Pessoa p){
        return pDAO.salvar(p);
    }
    public void editar(Pessoa p) {
        pDAO.editar(p);
    }
    
    public int excluir(Pessoa p) {
        return pDAO.excluir(p);
    }
    
    public List<Pessoa> getPessoas(){
        return pDAO.getPessoas();
    }
    
    public List<Pessoa> getPessoas(Pessoa p){
        return pDAO.getPessoas(p);
    }
    
    public List<Pessoa> getPessoas(String nome){
        return pDAO.getPessoas(nome);
    }
    
    public List<Pessoa> getPessoas(String nome, String dataInicio, String dataFim){
        return pDAO.getPessoas(nome, dataInicio, dataFim);
    }
    
    public List<Pessoa> getPessoas(String dataInicio, String dataFim){
        return pDAO.getPessoas(dataInicio, dataFim);
    }
    
}
