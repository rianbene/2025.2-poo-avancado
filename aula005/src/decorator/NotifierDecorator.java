package decorator;

public class NotifierDecorator implements Notifier {
	protected Notifier wrapee;
	public NotifierDecorator(Notifier n) {
		this.wrapee = n;
	}
	@Override
	public void send(String message) {
		wrapee.send(message);		
	}

}
