package bankdat;

public class Circle implements Shape {
	int r;
	double pi=3.14 , ar;
	public void input() 
	{
		r=6;
		
	}
    public void area () {
    	ar=pi*r*r;
    	System.out.println(" Area of Circle:" +ar);
    	
    }
}
