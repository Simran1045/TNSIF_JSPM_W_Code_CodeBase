package abstractDemo;

public class Sqaure extends Shape{
	float side;

	public Sqaure() {
	side=2.0f;
	}

	public Sqaure(float side) {
		
		this.side = side;
	}

	@Override
	public void calArea() {
		this.area=side*side;
		
	}

}
