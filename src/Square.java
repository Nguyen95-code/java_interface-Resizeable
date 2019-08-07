public class Square extends Shape implements Resizeable {
    @Override
    public void resize(double percent) {
        this.size += this.size * percent / 100;
    }

    public double size = 10;

    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean fill, double size) {
        super(color, fill);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return Math.pow(this.size, 2);
    }

    public double getPerimeter() {
        return 4 * this.size;
    }

    @Override
    public String toString() {
        return "Square size=" + size + " has Area = " + getArea() + " , Perimeter = " + getPerimeter();
    }
}
