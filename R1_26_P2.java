// นายดุษฎี เจนสำโรง 68152110502-5 ห้อง A เลขที่ 26
import java.util.Scanner;

public class R1_26_P2 {
    public static void main(String[] args) {
        final int START_JPY = 100;
        final int MAX_JPY = 500;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter exchange rate (THB per 1 JPY): ");
        double rate = sc.nextDouble();

        System.out.print("Enter step: ");
        int step = sc.nextInt();

        if (rate <= 0 || step <= 0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("JPY\tTHB");

        int rows = 0;
        for (int jpy = START_JPY; jpy <= MAX_JPY; jpy += step) {
            double thb = jpy * rate;
            System.out.printf("%d\t%.2f%n", jpy, thb);
            rows++;
        }

        System.out.println("Rows: " + rows);
    }
}
