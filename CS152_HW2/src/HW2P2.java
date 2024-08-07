/*
2.
	a. Write an interface Shape which contains two methods: double area() and double
	perimeter() which calculate and return (NOT print) the area and perimeter of a geo-
	metric shape
 
 	b.Write classes Circle, Rectangle and Triangle which implement the Shape interface.
	The constructors for each of these classes should have the following parameters:
	Circle : the x and y location of the center of the circle and the radius r of the circle.
	Rectangle : the x and y location of the lower left corner and the x and y location of
	the upper right corner
	Triangle : the x and y locations of the three vertices of the triangle
	(NOTE: You might want to look up Heron’s formula for one of these shapes). An
	example main code might look like the following:
	public static void main(String [] args)
	{
	Circle c = new Circle(1.2, 3.4, 5.0); // circle with center (1.2, 3.4) and radius 5
	Rectangle r = new Rectangle(0, 0, 10, 5); // rectangle with lower, left corner at (0,0)
	// and upper right at (10,5)
	Triangle t = new Triangle(0, 0, 0, 5, 6, 0); // triangle with vertices (0,0), (0,5) and (6,0)
	System.out.println(t.area()); // should output 15.0
	System.out.printf("%.4f\n", c.perimeter()); // should output 31.4156
	}
	
	c.The bounding box for any shape is the minimum size rectangle that contains the shape.
	Bounding boxes are often used in computer graphics to determine if two shapes might
	overlap. Write a method Rectangle boundingBox() for each of the three classes above
	which returns the appropriate bounding box (HINT: one of these is REALLY easy).
*/
public class HW2P2 {
	//a
	public interface Shape {

		  /**
		   * Calculates and returns the area of the shape.
		   *
		   * @return The area of the shape.
		   */
		  double area();

		  /**
		   * Calculates and returns the perimeter of the shape.
		   *
		   * @return The perimeter of the shape.
		   */
		  double perimeter();
		}
	
	//b
	public class Circle implements Shape {

		  private double x;
		  private double y;
		  private double r;

		  public Circle(double x, double y, double r) {
		    this.x = x;
		    this.y = y;
		    this.r = r;
		  }

		  @Override
		  public double area() {
		    return Math.PI * r * r;
		  }

		  @Override
		  public double perimeter() {
		    return 2 * Math.PI * r;
		  }
		}

		public class Rectangle implements Shape {

		  private double x;
		  private double y;
		  private double width;
		  private double height;

		  public Rectangle(double x, double y, double width, double height) {
		    this.x = x;
		    this.y = y;
		    this.width = width;
		    this.height = height;
		  }

		  @Override
		  public double area() {
		    return width * height;
		  }

		  @Override
		  public double perimeter() {
		    return 2 * (width + height);
		  }
		}

		public class Triangle implements Shape {

		  private double x1;
		  private double y1;
		  private double x2;
		  private double y2;
		  private double x3;
		  private double y3;

		  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		    this.x1 = x1;
		    this.y1 = y1;
		    this.x2 = x2;
		    this.y2 = y2;
		    this.x3 = x3;
		    this.y3 = y3;
		  }

		  @Override
		  public double area() {
		    double s = (x1 + x2 + x3) / 2;
		    return Math.sqrt(s * (s - x1) * (s - x2) * (s - x3));
		  }

		  @Override
		  public double perimeter() {
		    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) +
		        Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)) +
		        Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		  }
		}
	
	//c
	/*
	public class Circle implements Shape {

		  private double x;
		  private double y;
		  private double r;
		
		  public Circle(double x, double y, double r) {
		    this.x = x;
		    this.y = y;
		    this.r = r;
		  }
		
		  @Override
		  public double area() {
		    return Math.PI * r * r;
		  }
		
		  @Override
		  public double perimeter() {
		    return 2 * Math.PI * r;
		  }
		
		  @Override
		  public Rectangle boundingBox() {
		    return new Rectangle(x - r, y - r, 2 * r, 2 * r);
		  }
		}
		
		public class Rectangle implements Shape {
		
		  private double x;
		  private double y;
		  private double width;
		  private double height;
		
		  public Rectangle(double x, double y, double width, double height) {
		    this.x = x;
		    this.y = y;
		    this.width = width;
		    this.height = height;
		  }
		
		  @Override
		  public double area() {
		    return width * height;
		  }
		
		  @Override
		  public double perimeter() {
		    return 2 * (width + height);
		  }
		
		  @Override
		  public Rectangle boundingBox() {
		    return this;
		  }
		}
		
		public class Triangle implements Shape {
		
		  private double x1;
		  private double y1;
		  private double x2;
		  private double y2;
		  private double x3;
		  private double y3;
		
		  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		    this.x1 = x1;
		    this.y1 = y1;
		    this.x2 = x2;
		    this.y2 = y2;
		    this.x3 = x3;
		    this.y3 = y3;
		  }
		
		  @Override
		  public double area() {
		    double s = (x1 + x2 + x3) / 2;
		    return Math.sqrt(s * (s - x1) * (s - x2) * (s - x3));
		  }
		
		  @Override
		  public double perimeter() {
		    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) +
		        Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)) +
		        Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		  }
		
		  @Override
		  public Rectangle boundingBox() {
		    double minX = Math.min(x1, Math.min(x2, x3));
		    double minY = Math.min(y1, Math.min(y2, y3));
		    double maxX = Math.max(x1, Math.max(x2, x3));
		    double maxY = Math.max(y1, Math.max(y2, y3));
		    return new Rectangle(minX, minY, maxX - minX, maxY - minY);
		  }
		}
	 */
	
}