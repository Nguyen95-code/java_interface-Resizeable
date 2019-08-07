public class Rectangle extends Shape implements Resizeable {
    @Override
    public void resize(double percent) {
        this.width += this.width * percent / 100;
        this.height += this.height * percent / 100;
    }

    public double width = 5;
    public double height = 10;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean fill, double width, double height) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle has " + "width=" + width + ", height=" + height + ", has Area is " + getArea() + ", has Perimeter "
                + getPerimeter();
    }
}
