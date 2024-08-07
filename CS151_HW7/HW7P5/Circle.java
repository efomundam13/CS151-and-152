/*
Write a class Circle which can be used to represent (what else) a circle. The
class should have the fields for the x and y center of the circle and the radius r, all of type
double. Include the following methods:
 a three-argument constructor.
 accessor and mutator methods for all fields. For the radius, the mutator should check if
the passed-in value is negative and if so set the radius to 0.0.
 a toString and equals method. You may use any reasonable format for the output of
toString
 methods getArea and getCircumference.
 a method inside(x, y) which returns true if the point (x, y) is inside the circle.
 a method compareTo(Circle c) which returns -1 if this circle is smaller in area than c,
0 if they are the same size, and 1 if this circle is larger than c.
*/

public class Circle {

    // Fields
    private double x;
    private double y;
    private double r;

    // Constructor
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        if (r < 0) {
            r = 0.0;
        }
    }

    // Accessors
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            r = 0.0;
        }
        this.r = r;
    }

    // Mutators

    // toString and equals method
    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.x, x) == 0 &&
                Double.compare(circle.y, y) == 0 &&
                Double.compare(circle.r, r) == 0;
    }

    // Methods
    public double getArea() {
        return Math.PI * r * r;
    }

    public double getCircumference() {
        return 2 * Math.PI * r;
    }

    public boolean inside(double x, double y) {
        double d = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return d <= r;
    }

    public int compareTo(Circle c) {
        if (this.getArea() < c.getArea()) {
            return -1;
        } else if (this.getArea() > c.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}