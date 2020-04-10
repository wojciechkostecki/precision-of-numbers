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
            double x=0;
            while (x < number + 0.1) {
                System.out.printf("%.1f" + " ", x);
                x += 0.1;
            }
        }
        if (number < 0) {
            double y = 0;
            while (y > number - 0.1) {
                System.out.printf("%.1f" + " ", y);
                y -= 0.1;
            }
        }
        if (number == 0) {
            System.out.println("Wprowadzona liczba nie spełnia warunku.");
        }
    }
}
