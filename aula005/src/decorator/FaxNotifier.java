package decorator;

public class FaxNotifier implements Notifier {
	// a ser implementado
	@Override
	public void send(String message) {
		System.out.println("FAX: " + message);
	}
}
