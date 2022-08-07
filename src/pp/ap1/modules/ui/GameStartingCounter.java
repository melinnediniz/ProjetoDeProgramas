package pp.ap1.modules.ui;

public class GameStartingCounter {
	public void draw() throws InterruptedException {
		System.out.println("Get ready?");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("Let's Go! Have fun.");
	}
	public void run() throws InterruptedException {
		this.draw();
	}
}
