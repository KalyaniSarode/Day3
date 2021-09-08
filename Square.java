package bankdat;

public   class Square implements Shape {
	int s1, s2;
	int ar;
	public void input () {
		s1=2;
		s2=5;
     
	}
	public void area() {
		ar=s1*s2;
		System.out.println(" Area of Square:" + ar);
		
	}

}
