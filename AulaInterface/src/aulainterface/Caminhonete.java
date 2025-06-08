package aulainterface;

/**
 *
 * @author laila
 */
public class Caminhonete extends VeiculoRural{

    public Caminhonete(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }
     @Override
    public double calcularImposto(){
    return getValor()*0.08;  
    }
}
