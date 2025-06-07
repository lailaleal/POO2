package atividadeclasseabstrata;

/**
 *
 * @author Julli
 */
public class Principal {
    public static void main(String[] args) {
        Gerente a = new Gerente(300.00, "Ligia","Administrativo",0123, 4500.00);
        a.imprimirInformacoes();
        a.simularBeneficio(); 
        
        
        Vendedor b = new Vendedor(350," ","Eletronicos",0456,1240.00);
        b.imprimirInformacoes();
        b.simularBeneficio();
        
    }
    
}
