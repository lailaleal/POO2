package aulainterface;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
public abstract class VeiculoPNE extends VeiculoN implements Tributavel //era para ser um herança multipla
{
    private ArrayList<String> modificacoes; 

    public VeiculoPNE(String marca, String modelo, int ano, double valor, ArrayList<String> modificacoes) 
    {
        super(marca, modelo, ano, valor);// como ele herda os atributos do veiculoN, o contrutor chama-se super.
        this.modificacoes = modificacoes;
        
    }

    public ArrayList<String> getModificacoes() 
    {
        return modificacoes;
    } 
    
}
