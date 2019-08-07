public class Circle extends Shape implements Resizeable {
    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }

    public double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle radius=" + radius + "which is a subclass of " + super.toString();
    }
}
