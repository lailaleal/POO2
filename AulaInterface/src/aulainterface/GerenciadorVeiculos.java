package aulainterface;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
// CONTROLADOR: Uma classe que tem acesso a outras classes e faz uma interface, intermediar para que não seja necessário acessar de fato cada classe individualmente.
public class GerenciadorVeiculos // Fazer o gerenciador para veiculos PNE
{
    private ArrayList<VeiculoN> veiculosN;//Lista de carros, veiculos normais 
    // arraylist não foi instanciado, pois será instanciado via construtor, toda vez que tiver um objeto irei ter um instanciamnto de um obj 
    //diferente deste atributo
    public GerenciadorVeiculos()
    {
        veiculosN = new ArrayList();
        veiculosPNE = new ArrayList();
        veiculosEixoSimples = new ArrayList();
        veiculosRural = new ArrayList();
    }
    
    public void adicionarVeiculo(VeiculoN veiculoN) // adicionar um veiculo diferente ao arraylist
    { 
        this.veiculosN.add(veiculoN); 
    }
    
    public double calcularImpostoTotalVeiculosN() // calcular o imposto total, suponhamos que contenha 10 carros no arraylist, haverão 10 posições
            // via polimorfismo irei acessar o calcular imposto de cada veiculo, via for it tb. Somar o imposto de todos os veiculos
    { 
        double totalImposto = 0; 
        for (VeiculoN veiculo : veiculosN) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosN() 
    { 
        for (VeiculoN veiculo : veiculosN) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public double ImpostoPorVeiculoN(VeiculoN veiculo){ // polimorfismo, permite que utilizamos a classe pai em nome da classe filho, a classe pai contém o 
        // atributo calcular imposto
        return veiculo.calcularImposto(); // irá vir somente o imposto do veiculo individualmente 
    }
    
    //  GERENCIADOR DE VEICULOS PNE
    private ArrayList<VeiculoPNE> veiculosPNE;
    
    public void adicionarVeiculo(VeiculoPNE veiculoPNE) // adicionar um veiculo diferente ao arraylist
    { 
        this.veiculosPNE.add(veiculoPNE); 
    }
    
    public double calcularImpostoTotalVeiculosPNE() // calcular o imposto total, suponhamos que contenha 10 carros no arraylist, haverão 10 posições
            // via polimorfismo irei acessar o calcular imposto de cada veiculo, via for it tb. Somar o imposto de todos os veiculos
    { 
        double totalImposto = 0; 
        for (VeiculoPNE veiculo : veiculosPNE) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosPNE() 
    { 
        for (VeiculoPNE veiculo : veiculosPNE) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public double ImpostoPorVeiculoPNE(VeiculoPNE veiculo){ // polimorfismo, permite que utilizamos a classe pai em nome da classe filho, a classe pai contém o 
        // atributo calcular imposto
        return veiculo.calcularImposto(); // irá vir somente o imposto do veiculo individualmente 
    }
    
    private ArrayList<VeiculoEixoSimples> veiculosEixoSimples;
    
        public void adicionarVeiculo(VeiculoEixoSimples veiculoEixoSimples) // adicionar um veiculo diferente ao arraylist
    { 
        this.veiculosEixoSimples.add(veiculoEixoSimples); 
    }
    
    public double calcularImpostoTotalVeiculosEixoSimples() // calcular o imposto total, suponhamos que contenha 10 carros no arraylist, haverão 10 posições
            // via polimorfismo irei acessar o calcular imposto de cada veiculo, via for it tb. Somar o imposto de todos os veiculos
    { 
        double totalImposto = 0; 
        for (VeiculoEixoSimples veiculo : veiculosEixoSimples) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosEixoSimples() 
    { 
        for (VeiculoEixoSimples veiculo : veiculosEixoSimples) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public double ImpostoPorVeiculoEixoSimples(VeiculoEixoSimples veiculo){ // polimorfismo, permite que utilizamos a classe pai em nome da classe filho, a classe pai contém o 
        // atributo calcular imposto
        return veiculo.calcularImposto(); // irá vir somente o imposto do veiculo individualmente 
    }
        
    private ArrayList<VeiculoRural> veiculosRural;
    
            public void adicionarVeiculo(VeiculoRural veiculoRural) // adicionar um veiculo diferente ao arraylist
    { 
        this.veiculosRural.add(veiculoRural); 
    }
    
    public double calcularImpostoTotalVeiculosRural() // calcular o imposto total, suponhamos que contenha 10 carros no arraylist, haverão 10 posições
            // via polimorfismo irei acessar o calcular imposto de cada veiculo, via for it tb. Somar o imposto de todos os veiculos
    { 
        double totalImposto = 0; 
        for (VeiculoRural veiculo : veiculosRural) 
        { 
            totalImposto += veiculo.calcularImposto(); 
        } 
        return totalImposto; 
    }
    
    public void listarVeiculosRural() 
    { 
        for (VeiculoRural veiculo : veiculosRural) 
        { 
            System.out.println("Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno() + ", Valor: " + veiculo.getValor() + ", Imposto: " + veiculo.calcularImposto()); 
        } 
    }
    
    public double ImpostoPorVeiculoRural(VeiculoRural veiculo){ // polimorfismo, permite que utilizamos a classe pai em nome da classe filho, a classe pai contém o 
        // atributo calcular imposto
        return veiculo.calcularImposto(); // irá vir somente o imposto do veiculo individualmente 
    }
   
}


//package aulainterface;
//
//import java.util.ArrayList;
//
//public class GerenciadorVeiculos {
//    private ArrayList<VeiculoN> veiculosN;
//    private ArrayList<VeiculoPNE> veiculosPNE;
//    private ArrayList<VeiculoEixoSimples> veiculosEixoSimples;
//    private ArrayList<VeiculoRural> veiculosRural;
//    
//    public GerenciadorVeiculos() {
//        veiculosN = new ArrayList<>();
//        veiculosPNE = new ArrayList<>();
//        veiculosEixoSimples = new ArrayList<>();
//        veiculosRural = new ArrayList<>();
//    }
//    
//    public void adicionarVeiculo(VeiculoN veiculoN) {
//        this.veiculosN.add(veiculoN); 
//    }
//    
//    public double calcularImpostoTotalVeiculosN() {
//        double totalImposto = 0; 
//        for (VeiculoN veiculo : veiculosN) {
//            totalImposto += veiculo.calcularImposto(); 
//        } 
//        return totalImposto; 
//    }
//    
//    public void listarVeiculosN() {
//        for (VeiculoN veiculo : veiculosN) {
//            System.out.println("Marca: " + veiculo.getMarca() + 
//                             ", Modelo: " + veiculo.getModelo() + 
//                             ", Ano: " + veiculo.getAno() + 
//                             ", Valor: " + veiculo.getValor() + 
//                             ", Imposto: " + veiculo.calcularImposto()); 
//        } 
//    }
//    
//    public double ImpostoPorVeiculoN(VeiculoN veiculo) {
//        return veiculo.calcularImposto();
//    }
//}