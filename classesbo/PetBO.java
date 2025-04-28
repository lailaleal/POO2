/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpetshop.classesbo;

import com.mycompany.prjpetshop.classesdao.PetDAO;
import com.mycompany.prjpetshop.objetos.Pet;
import java.util.List;

/**
 *
 * @author laila
 */
public class PetBO {
       PetDAO pDAO;
    
    public PetBO(){
        pDAO = new PetDAO();
    }
    
    public Pet salvar(Pet p){
        return pDAO.salvar(p);
    }

    public List<Pet> getPetsPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Pet> getPetsPorNomeEData(String nome, String dataInicio, String dataFim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Pet> getPetsPorData(String dataInicio, String dataFim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Pet> getTodosPets() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
