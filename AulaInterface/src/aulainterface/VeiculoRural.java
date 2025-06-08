package aulainterface;

/**
 *
 * @author laila
 */
public abstract class VeiculoRural extends VeiculoN implements Tributavel {

    public VeiculoRural(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);
    }
    
}
