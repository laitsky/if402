package lecture.vincent.id.ac.umn;

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0, a, temp, input, countDigit = 0, aSum;
        System.out.print("Input: ");
        input = scanner.nextInt();
        while (input > 0) {
            input /= 10;
            countDigit++;
        }
        temp = input;
        while (input > 0) {
            a = input % 10;
            aSum = a;
            for (int i = 0; i < countDigit; i++) {
                aSum *= a;
            }
            input /= 10;
            c = c + aSum;
        }
        if (temp == c) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Bukan armstrong number");
        }
    }
}
