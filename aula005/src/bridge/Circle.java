package bridge;

public class Circle extends Shape {
	private int x, y, r;

	public Circle(int x, int y, int r, DrawingAPI api) {
		super(api);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawingAPI.drawCircle(x, y, r);
	}

}
