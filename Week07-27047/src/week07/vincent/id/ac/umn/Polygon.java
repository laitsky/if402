package week07.vincent.id.ac.umn;

public class Polygon {
    protected int width;
    protected int height;
    //Contoh function overloading constructor
    //perhatikan jumlah parameternya
    public Polygon() {
        this.width = 0;
        this.height = 0;
    }
    public Polygon(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void askWidth() {
        System.out.println("Object ini memiliki width dengan nilai " + this.width);
    }
    public void countSide() {
        System.out.println("Object ini jumlah sisinya tidak jelals");
    }
}
