public class Shape {
    public String color = "red";
    public boolean fill = true;

    public Shape() {

    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        if (this.fill) {
            return "a shape with color of " + this.color + "and filled";
        } else {
            return "a shape with color of " + this.color + "and not filled";
        }
    }
}
