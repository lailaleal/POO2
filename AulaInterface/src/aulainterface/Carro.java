package aulainterface;

/**
 *
 * @author Ligia
 */
public class Carro extends VeiculoN // essa versão so carro só existe para veiculo normal 
{ // o veiculo normal implementa tudo, e trás a interface para esta classe carro

    public Carro(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano, valor);// como ele herda os atributos do veiculoN, o contrutor chama-se super.
    }

    @Override // é necessário implemntar o metodo e fazer o construtor dele, não é preciso getter pois n há atributos,
    public double calcularImposto() 
    {
        return super.getValor() * 0.04;
    }
    
}

//package aulainterface;
//
//public class Carro extends VeiculoN {
//    public Carro(String marca, String modelo, int ano, double valor) {
//        super(marca, modelo, ano, valor);
//    }
//
//    @Override
//    public double calcularImposto() {
//        return super.getValor() * 0.04;
//    }
//}