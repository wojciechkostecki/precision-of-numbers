import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą różną od 0: ");
        int number = scanner.nextInt();

        if (number > 0) {
            double x = 0;
            while (x < number) {
                x += 0.1;
                System.out.printf("%.1f" + " ", x);
            }
        }
        if (number < 0) {
            double y = 0;
            while (y > number) {
                y -= 0.1;
                System.out.printf("%.1f" + " ", y);
            }
        }
        if (number == 0) {
            System.out.println("Wprowadzona liczba nie spełnia warunku.");
        }
    }
}
