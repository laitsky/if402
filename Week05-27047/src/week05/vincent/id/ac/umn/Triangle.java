package week05.vincent.id.ac.umn;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return hypotenuse + base + height;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}
