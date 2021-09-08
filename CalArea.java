package bankdat;

public class CalArea extends Shape {
	void rectangleArea(int l, int b)
	{
		System.out.println(" Area of Rectangle :" +(l*b));
	}
    void squareArea(int s) {
    	System.out.println(" Area of Square :" +(s*s));
    	
    }
    void circleArea(int r) {
    	System.out.println(" area of circle:" +(3.14*r*r));
    	
    }
    public static void main(String[]args) {
    	CalArea ca=new CalArea();
    	ca.rectangleArea(4,3);
    	ca.circleArea(6);
    	ca.squareArea(4);
    }
}
