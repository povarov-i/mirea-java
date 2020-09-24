public class Circle {
    private int radius;
    private int diameter;
    private double square;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.updateDiameter(this.radius);
        this.updateSquare(this.radius);
    }

    public void updateDiameter(int radius) {
        this.diameter = radius * 2;
    }

    public void updateSquare(int radius) {
        this.square = 3.14 * radius * radius;
    }

    public String toString() {
        String str = "Circle's radius is " + this.radius + " ,diameter is " + this.diameter + " and square is " + this.square;
        return(str);
    }
}
