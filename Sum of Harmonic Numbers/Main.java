import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to find to harmonic result: ");
        int number = input.nextInt();
        int result = 0;

        for (int i = 1; i <= number; i++){
            result += (1 / i);
        }

        System.out.println("The result is: " + result);
    }
}
