import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.print("Digite um numero:");
        int numero = scanner.nextInt();

        for(i = numero ; i >= 0 ; i--){
            System.out.println(i);
        }
    }
}