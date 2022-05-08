import java.util.Scanner;
public class lenght {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Irémos lhe informar quantas letra têm em alguma palavra qualquer.");
        System.out.print("Digite a palavra: ");
        String x = entrada.next();
        
        int qntd = x.length();

        System.out.println(x + " têm exatas " + qntd + " letras.");
    }
}
