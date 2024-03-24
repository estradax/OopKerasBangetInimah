package io.github.estradax;

public class Application {
	public static void main(String[] args) {

		Window window = new Window();

		window.open();

		window.display();

		window.move();

		Event event = new Event();

		window.handleEvent(event);

		window.close();
	}
}
