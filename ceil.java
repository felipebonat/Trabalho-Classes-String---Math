import java.util.Scanner;
public class ceil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos arredondar qualquer número 'quebrado' informado.");
        System.out.print("Digite o número: ");
        double x = entrada.nextDouble();

        System.out.println("Arredondando " + x + " para cima, temos " + Math.ceil(x));
        System.out.println("Arredondando " + x + " para baixo, temos " + Math.floor(x) );
    
    }
}