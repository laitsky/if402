package week05.vincent.id.ac.umn;

import java.util.Scanner;

public class Main {
    public static void calculateCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Lingkaran---------------");

        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = scanner.next();

        Circle circle = new Circle(radius, color);

        System.out.println("Warna\t\t\t\t: " + circle.getColor());
        System.out.println("Jari-jari\t\t\t: " + circle.getRadius());
        System.out.println("Keliling Lingkaran\t: " + circle.getPerimeter());
        System.out.println("Luas Lingkaran\t\t: " + circle.getArea());
    }

    public static void calculateSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Persegi---------------");

        System.out.print("Masukkan panjang sisi: ");
        double side = scanner.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = scanner.next();

        Square square = new Square(side, color);

        System.out.println("Warna\t\t\t\t\t: " + square.getColor());
        System.out.println("Panjang Sisi\t\t\t: " + square.getSideLength());
        System.out.println("Keliling Persegi\t\t: " + square.getPerimeter());
        System.out.println("Luas Persegi\t\t\t: " + square.getArea());
    }

    public static void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Persegi Panjang---------------");

        System.out.print("Masukkan panjang: ");
        double length = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double width = scanner.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = scanner.next();

        Rectangle rectangle = new Rectangle(length, width, color);

        System.out.println("Warna\t\t\t\t\t: " + rectangle.getColor());
        System.out.println("Panjang & Lebar\t\t\t: " + rectangle.getLength() + " & " + rectangle.getWidth());
        System.out.println("Keliling Persegi Panjang: " + rectangle.getPerimeter());
        System.out.println("Luas Persegi Panjang\t: " + rectangle.getArea());
    }

    public static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------Segitiga Siku-Siku---------------");

        System.out.print("Masukkan alas: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(base, height, color);

        System.out.println("Warna\t\t\t: " + triangle.getColor());
        System.out.println("Alas & Tinggi\t\t: " + triangle.getBase() + " & " + triangle.getHeight());
        System.out.println("Keliling Segitiga: " + triangle.getPerimeter());
        System.out.println("Luas Segitiga\t\t: " + triangle.getArea());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        for (; ; ) {
            System.out.println("--------------Program Menghitung Bangun Ruang--------------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateSquare();
                    break;
                case 3:
                    calculateRectangle();
                    break;
                case 4:
                    calculateTriangle();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    return;
            }
        }
    }
}
