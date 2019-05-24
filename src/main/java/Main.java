import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Podaj imie numer " + (i + 1));
            names[i] = sc.nextLine();
        }

        for (int i = names.length - 1; i > -1; i--) {
            System.out.println("imie numer " + (i + 1) + " to " + names[i]);
        }

    }
}
