import java.util.Scanner;
public class perfetNumberFinder {
    public static void main(String[] args) {

        int Num;
        int Sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        Num = input.nextInt();

        for (int i = 1; i <= Num-1; i++) {
            if (Num % i == 0) {
                Sum += i;
            }
        }if (Sum == Num) {
            System.out.println(Num + " is the perfect number.");
        } else {
            System.out.println(Num + " is not perfect number.");
        }
    }
}