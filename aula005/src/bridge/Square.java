package bridge;

public class Square extends Shape {
	int x, y;

	public Square(int x, int y, DrawingAPI api) {
		super(api);
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		this.drawingAPI.drawSquare(x, y);
	}

}
