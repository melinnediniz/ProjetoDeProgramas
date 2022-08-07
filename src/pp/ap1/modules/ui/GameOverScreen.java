package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.modules.ui.utils.TextAnimator;

public class GameOverScreen {
	private void input() {
		System.out.println("Press any key to return to finish...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	
	private void draw() {
		try {
			TextAnimator.run("YOU FAILED!\n", 20);
			TextAnimator.run("Enemy: \"It's over. I have the high ground.\"\n", 50);
			TextAnimator.run("You: :(\n\n", 50);
		} catch (InterruptedException e) {
			System.exit(0);
		}
	}
	
	public void run(){
		this.draw();
		this.input();
	}
}
