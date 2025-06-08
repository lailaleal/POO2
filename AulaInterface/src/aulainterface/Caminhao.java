package aulainterface;

/**
 *
 * @author laila
 */
public class Caminhao extends VeiculoEixoSimples {

    public Caminhao(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }
    
    @Override
    public double calcularImposto(){
    return getValor()*0.06;  
    }  
}
