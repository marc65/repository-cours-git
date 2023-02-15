import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre de Rutika : ");
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();
        System.out.println("Création de " +number+" de Rutika...");
        Rutika rutika = new Rutika();
        rutika.CreationRutika(number);
    }
}