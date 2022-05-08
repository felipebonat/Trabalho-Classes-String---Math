import java.util.Scanner;
public class startsWith {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos lhe dizer se o site pode ou não ser confiavél. ");
        System.out.print("Digite o endereço do site: ");
        String site = entrada.next();

        if (site.startsWith("https")){
            System.out.println("Esse site parece ser confiável.");
        }else {
            System.out.println("Esse site não parece ser confiável");
        }
    }
}