package abstractDemo;

public class Rectangular extends Shape{
	float width;
	float height;

	//default constructor
	public Rectangular() {
	width=3.2f;
	height=3.2f;
	
	}
     //para
	public Rectangular(float width, float height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		this.area=width*height;
		
	}

}
