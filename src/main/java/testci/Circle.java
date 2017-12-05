package testci;
import java.awt.Graphics;

class Circle {	
	/* Point x coordinate */ 
	private int x;
	/* Point y coordinate */
	private int y;
	/* Radius */
	private int r;
	
	public static final double pi = 3.14;
	private static int count;
	private final int id;
	
	/** default constructor */
	Circle() {
		this.x = 0;
		this.y = 0;
		this.r = 3;
		count += 1;
		this.id = count;
	}
	
	/** Overloaded constructor */
	Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.id = count;
	}
	/** Overloaded constructor */
	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		id = count;
	}
	/** Copy constructor */
	public Circle copy() {
		Circle new_circle = new Circle();
		new_circle.x = this.x;
		new_circle.y = this.y;
		new_circle.r = this.r;
		return new_circle;
		/** alternative solution **/
		// return new Circle(this.x, this.y, this.r);
	}
	
	/** Circle destructor */
    public void finalize() {
    	System.out.println("Destroying circle (" + 
    	    	this.x +"," + this.y + "," + this.r + ")");
	}
	
    /** Getter and Setter methods */
    /* Sets the x coordinate */
    public void setX(int x) { this.x = x; }
    /* Sets the y coordinate */
    public void setY(int y) { this.y = y; }
    /* Sets the radius */
    public void setR(int r) { this.r = r; }
	/* Custom setter for both x & y coordinates */
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
    /* Returns the x coordinate */
	public int getX() { return x; }
	/* Returns the y coordinate */
	public int getY() { return y; }
	/* Returns the radius */
	public int getR() { return r; }
	/* Returns the global count value */
	public static int getCount() { return count; }
	/* Returns the id of the circle */
	public int getId() { return this.id; }

	/** Calculates and returns the perimeter of the circle */
	public double getPerimeter() {
		double perimeter = 2*pi*this.r;
		return perimeter; 
	}
	
	/** Calculates and prints the perimeter of the circle */
	public void calculatePerimeter() {
		double perimeter = 2*pi*this.r;
		System.out.println("Perimeter is " + perimeter); 
	}
	
	/** Calculates and returns the area of the circle */
	public double area() {
		/* Note that the calculation is performed just before the return. 
		This technique produces fewer lines of code and improves the readability */
		return pi*Math.pow(this.r, 2);
	}
	
	/** Checks if two Circles (this & c) have common centers 
	 * If yes it returns true, otherwise, it returns false */
	public boolean cocentric(Circle c) {
		return (this.x == c.x && this.y == c.y);
	}
	
	public static void main(String args[]) {
		System.out.println("Hola!");
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2,3);
		Circle c3 = new Circle(3,2,5);
		
		System.out.println("c1 count is " + c1.count +  ", id is " + c1.getId());
		System.out.println("c2 count is " + c2.count +  ", id is " + c2.getId());
		System.out.println("c3 count is " + c3.count +  ", id is " + c3.getId());

		c3 = c2;
		c2 = null;
		System.out.println("c3 is " + c3.getId());
		
        // Force the garbage collector to run
        System.gc();
	}
		
}