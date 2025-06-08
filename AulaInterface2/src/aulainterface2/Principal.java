package aulainterface2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
         //Scanner - classe que implementa as operações de 
        //entrada de dados pelo teclado no console
        //lendo int - ler.nextInt();
        //lendo float - ler.nextFloat(); 
        //lendo double - ler.nextDouble();
        //lendo uma String, usado na leitura de palavras simples que não 
            //usam o caractere de espaço (ou barra de espaço) - ler.next();
        //lendo uma String, usado na leitura de palavras compostas - ler.nextLine();
        
        Aluno ian = new Aluno();
        Aluno ph = new Aluno();
        Aluno pablo = new Aluno();
        
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o nome do aluno: ");
        ian.setNome(ler.nextLine());
        
        System.out.println("Insira o curso do aluno: ");
        ian.setCurso(ler.nextLine());
        ler.nextLine();
        
        System.out.println("Insira o RA do aluno: ");
        ian.setRA(ler.nextLine());
        

       
        
        Aluno dao = new Aluno();
        dao.salvar();
        dao.alterar();
        dao.deletar();
        dao.selecionar();
        
    }
    
}
//
//package aulainterface2;
//
//import java.util.Scanner;
//
///**
// * Classe principal que contém o método main e a lógica de interação com o usuário
// */
//public class Principal {
//    public static void main(String[] args) {
//        Scanner ler = new Scanner(System.in);
//        
//        // Criando um novo aluno
//        Aluno aluno = new Aluno();
//        
//        // Lendo dados do aluno
//        System.out.println("Insira o nome do aluno: ");
//        aluno.setNome(ler.nextLine());
//        
//        System.out.println("Insira o curso do aluno: ");
//        aluno.setCurso(ler.nextLine());
//        
//        System.out.println("Insira o RA do aluno: ");
//        aluno.setRA(ler.nextLine());
//        
//        // Demonstrando as operações DAO
//        System.out.println("\nDemonstrando operações DAO:");
//        aluno.salvar();
//        aluno.alterar();
//        aluno.deletar();
//        aluno.selecionar();
//        
//        ler.close();
//    }
//}