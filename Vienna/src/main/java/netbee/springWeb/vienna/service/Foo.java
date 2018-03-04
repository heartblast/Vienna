package netbee.springWeb.vienna.service;

public class Foo {
	public void listen(String message) {
		System.out.println(message.getClass().getName());
		
		System.out.println(message);
	}
}
