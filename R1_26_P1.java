// นายดุษฎี เจนสำโรง 68152110502-5 ห้อง A เลขที่ 26
import java.util.Scanner;

public class R1_26_P1 {
    public static void main(String[] args) {
        final int SERVICE_EXPRESS = 1;
        final int SERVICE_STANDARD = 2;
        final int SERVICE_ECONOMY = 3;

        final double FEE_EXPRESS = 90;
        final double FEE_STANDARD = 60;
        final double FEE_ECONOMY = 45;

        final int BASE_WEIGHT_KG = 3;      // น้ำหนักที่เริ่มต้นคิดค่าธรรมเนียม
        final double EXTRA_FEE_PER_KG = 10; // ค่าธรรมเนียมเพิ่มเติมส่วนที่เกิน

        final int MIN_WEIGHT_KG = 1;
        final int MAX_WEIGHT_KG = 30;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter service (1-3): ");
        int service = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        int weight = sc.nextInt();

        String serviceName;
        double baseFee;

        switch (service) {
            case SERVICE_EXPRESS:
                serviceName = "Express";
                baseFee = FEE_EXPRESS;
                break;
            case SERVICE_STANDARD:
                serviceName = "Standard";
                baseFee = FEE_STANDARD;
                break;
            case SERVICE_ECONOMY:
                serviceName = "Economy";
                baseFee = FEE_ECONOMY;
                break;
            default:
                System.out.println("Invalid service");
                return;
        }

        if (weight < MIN_WEIGHT_KG || weight > MAX_WEIGHT_KG) {
            System.out.println("Invalid weight");
            return;
        }

        double totalFee = baseFee;
        if (weight > BASE_WEIGHT_KG) {
            totalFee += (weight - BASE_WEIGHT_KG) * EXTRA_FEE_PER_KG;
        }

        System.out.println("Service: " + serviceName);
        System.out.printf("Shipping fee: %.2f%n", totalFee);
    }
}
