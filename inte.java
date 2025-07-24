import java.util.Scanner;

class inte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the time: ");
        float time = scanner.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
