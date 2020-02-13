/* author 1: Vincent Diamond
author 2: Alfredo Adiyasa
 */

package lecture.vincent.id.ac.umn;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        System.out.print("Input: ");
        input = scanner.next();

        if(isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }
}
