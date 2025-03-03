//Aula sobre tipos primitivos e manipulação de dados
import java.util.Scanner;
public class TiposPrimitivosEManipulaçãoDeImagens {
    public static void main(String[] args){
         //int idade = 3; (atribuindo um valor inteiro)
         //int idade = (int) 3; (int) <- Considere esse 3 como inteiro (typecast)
         //Integer idade = new Intenger; < - Wrapper Class / involucro

         
         float nota = 8.4f;
         String nome = "Pedro";

         //Saida de dados
         System.out.println("A nota de " + nome +" é " + nota); 
         System.out.printf("A nota de %s é %.2f\n",nome, nota);
         System.out.format("A nota de %s é %.2f\n",nome, nota);
         System.out.print("A nota de " + nome +" é " + nota);

         //Entrada de dados
         Scanner teclado =  new Scanner(System.in);

         System.out.print("\nDigite o nome do aluno: ");
         String nome2 = teclado.nextLine();
         System.out.println("Digite a nota do aluno: ");
         float nota2 = teclado.nextFloat();

         System.out.format("A nota de %s é %.2f\n",nome2, nota2);

         //Incompatibilidades
         int num = 30;
         String valor = Integer.toString(num); //O valor inteiro vai se transformar em String

         System.out.println(valor);
         
    }
}
