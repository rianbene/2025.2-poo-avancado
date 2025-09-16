package bridge;

public class DrawingAPI1 implements DrawingAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("API1: círculo em " + x + "," + y + " de raio " + radius);
	}

	@Override
	public void drawSquare(int x, int y) {
		System.out.println("API1: quadrado em " + x + "," + y);
	}

}
