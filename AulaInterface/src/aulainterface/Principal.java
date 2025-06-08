package aulainterface;

import java.util.ArrayList;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        
        System.out.println("******************************* CARROS *******************************************************");
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); 
        Carro carro1 = new Carro("Toyota", "Corolla", 2021, 80000);
        Carro carro2 = new Carro("VolksWagen", "Fox Connect", 2020, 40000);
        
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(carro2);
        
        System.out.println("Carros sem PNE no sistema:"); 
        gerenciador.listarVeiculosN();
        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN()); 
        
        System.out.println("Imposto individual do carro 2: R$ " + gerenciador.ImpostoPorVeiculoN(carro2) );
        System.out.println("Imposto individual do carro 1: R$ " + gerenciador.ImpostoPorVeiculoN(carro1) );
        
        // Falta a classe PNE, o main sabe que tenho acesso a um controlador do sistema que é o gerenciador de veiculos e os carros que tenho 
        // em minha concecionária. Caso eu queira abrir para outro tipo de carro ex: SUV, crio a classe, faço a classe extender ou VeiculoN ou VeiculoPNE
        //e coloco mais um método em meu gencuador; Não precisa de if, for..
        //  SÓ TEMOS O GERENCIADOR DE VEICULOS NORMAL É NECESSÁRIO IMPLEMENTAR O PNE
        System.out.println("******************************* MOTOS *******************************************************");
        GerenciadorVeiculos gerenciador2 = new GerenciadorVeiculos(); // neste exato momento ele instancia um arrayList, que está dentro do construtor
        // Moto implementa o carro normal 
        Moto moto1 = new Moto("CG", "CG150",2010, 8000.00);
        Moto moto2 = new Moto("Harley", "HarleyXLI", 2024, 150000.00);
        // vou adicionar as motos no gerenciador 
        gerenciador2.adicionarVeiculo(moto1);
        gerenciador2.adicionarVeiculo(moto2);
        System.out.println("Motos sem PNE no sistema:"); 
        gerenciador2.listarVeiculosN();
        System.out.println("Imposto total: R$ " + gerenciador2.calcularImpostoTotalVeiculosN());
        //  IMPOSTO INDIVIDUAL DA MOTO 2
        System.out.println("Imposto individual da moto 2: R$ " + gerenciador2.ImpostoPorVeiculoN(moto2) );
        System.out.println("Imposto individual da moto 1: R$ " + gerenciador2.ImpostoPorVeiculoN(moto1) );
        
        
        System.out.println("******************************* FURGAO *******************************************************");
        GerenciadorVeiculos gerenciador3 = new GerenciadorVeiculos();
        // Deve-se usar um ArrayList<String> na principal porque o construtor da classe Furgao espera um parâmetro desse tipo para armazenar 
        // múltiplas modificações, e não uma string única.
       
        ArrayList <String> modificacoes1 = new ArrayList<String>();
       modificacoes1.add("Ajustes no banco");
       
        ArrayList <String> modificacoes2 = new ArrayList<String>();
       modificacoes2.add("Controles manuais");
       
        Furgao furgao1 = new Furgao("Ford", "Transit",2022, 198000.00, modificacoes1);
        Furgao furgao2 = new Furgao("Mercedes-Benz", "Sprinter", 2022, 150000.00, modificacoes2);
        // vou adicionar os furgões no gerenciador 
        gerenciador3.adicionarVeiculo(furgao1);
        gerenciador3.adicionarVeiculo(furgao2);
        System.out.println("Furgoes contem PNE no sistema:"); 
        gerenciador3.listarVeiculosPNE();
        System.out.println("Imposto total: R$ " + gerenciador3.calcularImpostoTotalVeiculosPNE());
        //  IMPOSTO INDIVIDUAL  DO FURGÃO
        System.out.println("Imposto individual do Furgao 1: R$ " + gerenciador3.ImpostoPorVeiculoPNE(furgao1) );
        System.out.println("Imposto individual do Furgao 2: R$ " + gerenciador3.ImpostoPorVeiculoPNE(furgao2) );

        System.out.println("******************************* CAMINHAO *******************************************************");
        GerenciadorVeiculos gerenciador4 = new GerenciadorVeiculos(); // neste exato momento ele instancia um arrayList, que está dentro do construtor
        
        Caminhao caminhao1 = new Caminhao("Mercedes-Benz", "Atego 2426", 2010, 280000.00);
        Caminhao caminhao2 = new Caminhao("Scania", "R450", 2024, 450000.00);
        
        gerenciador4.adicionarVeiculo(caminhao1);
        gerenciador4.adicionarVeiculo(caminhao2);
        System.out.println("Caminhao sem PNE no sistema:"); 
        gerenciador4.listarVeiculosEixoSimples();
        System.out.println("Imposto total: R$ " + gerenciador4.calcularImpostoTotalVeiculosEixoSimples());
      
        System.out.println("Imposto individual do caminhao 2: R$ " + gerenciador4.ImpostoPorVeiculoEixoSimples(caminhao2) );
        System.out.println("Imposto individual do caminhao 1: R$ " + gerenciador4.ImpostoPorVeiculoEixoSimples(caminhao1) );
        
        System.out.println("******************************* ONIBUS *******************************************************");
        GerenciadorVeiculos gerenciador5 = new GerenciadorVeiculos(); // neste exato momento ele instancia um arrayList, que está dentro do construtor
         
        Onibus onibus1 = new Onibus("Mercedes-Benz", "OF-1721", 2010, 580000.00);
        Onibus onibus2 = new Onibus("Volvo", "B450R", 2024, 1500000.00);
       
        gerenciador5.adicionarVeiculo(onibus1);
        gerenciador5.adicionarVeiculo(onibus2);
        System.out.println("Onibus sem PNE no sistema:"); 
        gerenciador5.listarVeiculosEixoSimples();
        System.out.println("Imposto total: R$ " + gerenciador5.calcularImpostoTotalVeiculosEixoSimples());
      
        System.out.println("Imposto individual do onibus 2: R$ " + gerenciador5.ImpostoPorVeiculoEixoSimples(onibus2) );
        System.out.println("Imposto individual do onibus 1: R$ " + gerenciador5.ImpostoPorVeiculoEixoSimples(onibus1) );
        
        System.out.println("******************************* TRATOR *******************************************************");
        GerenciadorVeiculos gerenciador6 = new GerenciadorVeiculos(); // neste exato momento ele instancia um arrayList, que está dentro do construtor
         
        Trator trator1 = new Trator("John Deere", "5075E", 2010, 4750000.00);
        Trator trator2 = new Trator("Massey Ferguson", "MF 8S.205", 2024, 913000.00);
        
        gerenciador6.adicionarVeiculo(trator1);
        gerenciador6.adicionarVeiculo(trator2);
        System.out.println("Trator sem PNE no sistema:"); 
        gerenciador6.listarVeiculosRural();
        System.out.println("Imposto total: R$ " + gerenciador6.calcularImpostoTotalVeiculosRural());
      
        System.out.println("Imposto individual do trator 2: R$ " + gerenciador6.ImpostoPorVeiculoRural(trator2) );
        System.out.println("Imposto individual do trator 1: R$ " + gerenciador6.ImpostoPorVeiculoRural(trator1) );
        
        System.out.println("******************************* CAMINHONETE *******************************************************");
        GerenciadorVeiculos gerenciador7 = new GerenciadorVeiculos(); // neste exato momento ele instancia um arrayList, que está dentro do construtor
        
        Caminhonete caminhonete1 = new Caminhonete("Toyota", "Hilux", 2010, 118000.00);
        Caminhonete caminhonete2 = new Caminhonete("Chevrolet", "S10 High Country", 2024, 250000.00);

         
        gerenciador7.adicionarVeiculo(caminhonete1);
        gerenciador7.adicionarVeiculo(caminhonete2);
        System.out.println("Caminhonete sem PNE no sistema:"); 
        gerenciador7.listarVeiculosRural();
        System.out.println("Imposto total: R$ " + gerenciador7.calcularImpostoTotalVeiculosRural());
      
        System.out.println("Imposto individual do trator 2: R$ " + gerenciador7.ImpostoPorVeiculoRural(caminhonete2) );
        System.out.println("Imposto individual do trator 1: R$ " + gerenciador7.ImpostoPorVeiculoRural(caminhonete1) );
        
    }   
}
    
//     Scanner ler = new Scanner(System.in);
//        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();
//        
//        System.out.println("******************************* CARROS *******************************************************");
//        
//        // Lendo dados do primeiro carro
//        System.out.println("Digite os dados do primeiro carro:");
//        System.out.println("Marca: ");
//        String marca1 = ler.nextLine();
//        
//        System.out.println("Modelo: ");
//        String modelo1 = ler.nextLine();
//        
//        System.out.println("Ano: ");
//        int ano1 = Integer.parseInt(ler.nextLine());
//        
//        System.out.println("Valor: ");
//        double valor1 = Double.parseDouble(ler.nextLine());
//        
//        Carro carro1 = new Carro(marca1, modelo1, ano1, valor1);
//        
//        // Lendo dados do segundo carro
//        System.out.println("\nDigite os dados do segundo carro:");
//        System.out.println("Marca: ");
//        String marca2 = ler.nextLine();
//        
//        System.out.println("Modelo: ");
//        String modelo2 = ler.nextLine();
//        
//        System.out.println("Ano: ");
//        int ano2 = Integer.parseInt(ler.nextLine());
//        
//        System.out.println("Valor: ");
//        double valor2 = Double.parseDouble(ler.nextLine());
//        
//        Carro carro2 = new Carro(marca2, modelo2, ano2, valor2);
//        
//        gerenciador.adicionarVeiculo(carro1);
//        gerenciador.adicionarVeiculo(carro2);
//        
//        System.out.println("\nCarros sem PNE no sistema:"); 
//        gerenciador.listarVeiculosN();
//        System.out.println("Imposto total: " + gerenciador.calcularImpostoTotalVeiculosN()); 
//        
//        System.out.println("Imposto individual do carro 2: R$ " + gerenciador.ImpostoPorVeiculoN(carro2));
//        System.out.println("Imposto individual do carro 1: R$ " + gerenciador.ImpostoPorVeiculoN(carro1));
//        
//        ler.close();
//    }
//}
