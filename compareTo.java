import java.util.Scanner;
public class compareTo {    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O programa irá lhe informar qual das duas SEQUÊNCIAS de caracteres é maior(não de espaços).");

        System.out.print("Digite a primeira sequência: ");
        String x = entrada.next();

        System.out.print("Digite a segunda sequência: ");
        String y = entrada.next();

        int comparacao = x.compareTo(y);

        int qntdX = x.length();
        int qntdY = y.length();

        if (comparacao > 0){
            System.out.println(x + " é uma sequência maior que " + y);
            System.out.println(x + " têm " + qntdX + " caracteres");
        }else if (comparacao == 0){
            System.out.println("Ambas as sequências têm o mesmo 'tamanho'. ");
        }else{
            System.out.println(y + " é uma sequência maior que " + x);
            System.out.println(x + " têm " + qntdY + " caracteres");
        }

    }
}