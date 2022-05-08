import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random gerador = new Random();
        System.out.println("Uma sequência de 10 números totalmente aleatório:");
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt());
        }
    }
}