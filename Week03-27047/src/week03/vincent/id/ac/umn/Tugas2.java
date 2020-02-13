package week03.vincent.id.ac.umn;

import java.util.Scanner;
import java.lang.String;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, containsString, concatString, toReplace, replaceWith, splitString;
        String[] arrOfStr;
        int inputMenu, inputCharAt, mSubstringIndex, nSubstringIndex;

        System.out.print("Masukkan nama anda: ");
        nama = scanner.nextLine();
        System.out.println("---------------------------------");

        System.out.println("String anda: " + nama);
        System.out.println("1. charAt\t\t\t2. length");
        System.out.println("3. substring(n)\t\t4. substring(m,n)");
        System.out.println("5. contains\t\t\t6. concat");
        System.out.println("7. replace\t\t\t8. split");
        System.out.println("9. lowerCase\t\t10. upperCase");
        System.out.print("Pilih menu: ");
        inputMenu = scanner.nextInt();

        switch (inputMenu) {
            case 1:
                System.out.println("-----charAt-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input\t: ");
                inputCharAt = scanner.nextInt();
                System.out.println("Hasil\t: " + nama.charAt(inputCharAt));
                break;
            case 2:
                System.out.println("-----length-----");
                System.out.println("Nama\t: " + nama);
                System.out.println("Panjang\t: " + nama.length());
                break;
            case 3:
                System.out.println("-----substring(n)-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input\t: ");
                nSubstringIndex = scanner.nextInt();
                System.out.println("Hasil\t: " + nama.substring(nSubstringIndex));
                break;
            case 4:
                System.out.println("-----substring(m,n)-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input mulai\t: ");
                mSubstringIndex = scanner.nextInt();
                System.out.print("Input akhir\t: ");
                nSubstringIndex = scanner.nextInt();
                System.out.println("Hasil\t: " + nama.substring(mSubstringIndex, nSubstringIndex));
                break;
            case 5:
                System.out.println("-----contains-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input\t: ");
                containsString = scanner.next();
                System.out.println("Hasil\t: " + nama.contains(containsString));
                break;
            case 6:
                scanner.nextLine();
                System.out.println("-----concat-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input\t: ");
                concatString = scanner.nextLine();
                System.out.println("Hasil\t: " + nama + " " + concatString);
                break;
            case 7:
                System.out.println("-----replace-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input kata yang ingin diganti: ");
                toReplace = scanner.next();
                System.out.print("Input kata pengganti: ");
                replaceWith = scanner.next();
                System.out.println("Hasil\t: " + nama.replace(toReplace, replaceWith));
                break;
            case 8:
                System.out.println("-----split-----");
                System.out.println("Nama\t: " + nama);
                System.out.print("Input\t: ");
                splitString = scanner.next();
                arrOfStr = nama.split(splitString);
                for (String str : arrOfStr) {
                    System.out.println("Hasil\t: " + str);
                }
                break;
            case 9:
                System.out.println("-----lowerCase-----");
                System.out.println("Nama\t: " + nama);
                System.out.println("Hasil\t: " + nama.toLowerCase());
                break;
            case 10:
                System.out.println("-----upperCase-----");
                System.out.println("Nama\t: " + nama);
                System.out.println("Hasil\t: " + nama.toUpperCase());
                break;
        }
    }
}