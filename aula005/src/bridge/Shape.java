package bridge;

public abstract class Shape {
	protected DrawingAPI drawingAPI;

	public Shape(DrawingAPI api) {
		this.drawingAPI = api;
	}

	public abstract void draw();
}
