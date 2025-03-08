
public class Operadores {
    public static void main(String[] args) {
        //operadores aritméticos = + - * / %
        //operadores unários = ++ -- | a++ a--
        //operadores de atribuição = += -= *= /= %=
        //Classe Math = PI pow sqrt cbrt

        double nota1 = 56;
        double nota2 = 78;

        double media = (nota1 + nota2) / 2;
        System.out.println(media);
        System.out.println(++media);
        System.out.println(--media);
        
        double nota3 = 98;
        double nota4 = 58;

        double media2 = (nota3+nota4) / 2;
        
        media += media2;

        System.out.println(media*Math.PI);
        double num = Math.random();
        System.out.println(num);


    }
}