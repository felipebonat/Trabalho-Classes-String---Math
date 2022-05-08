import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O programa irá lhe informar qual o maior e menor valor.");

        System.out.print("Primeiro número: ");
        double a = entrada.nextDouble();

        System.out.print("Primeiro número: ");
        double b = entrada.nextDouble();

        System.out.print("Primeiro número: ");
        double c = entrada.nextDouble();

        System.out.print("Primeiro número: ");
        double d = entrada.nextDouble();
        
        System.out.print("Primeiro número: ");
        double e = entrada.nextDouble();

        double x = Math.max(a, b);
        double x1 = Math.max(x, c);
        double x2 = Math.max(x1, d);
        double x3 = Math.max(x2, e);

        double y = Math.min(a, b);
        double y1 = Math.min(y, c);
        double y2 = Math.min(y1, d);
        double y3 = Math.min(y2, e);

        System.out.println("O maior número: " + x3);
        System.out.println("O menor número: " + y3);
    }
}
