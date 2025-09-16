package decorator;

public class SMSNotifier extends NotifierDecorator {

	public SMSNotifier(Notifier n) {
		super(n);
	}

	public void send(String message) {
		super.send(message);
		System.out.println("SMS: " + message);
	}
}
