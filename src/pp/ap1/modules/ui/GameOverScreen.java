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
			String txt1 = "### ###   ####  #### ###   ######     ##    ####  ####   ######  ######  \r\n";
			String txt2 = "### ###   ####  #### ###   ######     ##    ####  ####   ######  ######  \r\n";
			String txt3 = " ## #   ###  ##  ##  ##     ## #     ###     ##    ##     ## #    ##  ## \r\n";
			String txt4 = " ###    ##   ## ##  ##     #####    #  ##   ##    ##     #####   ##   ## \r\n";
			String txt5 = "  #     ##  ### ##  ##     ##  #    #####   ##    ##     ##      ##  ### \r\n";
			String txt6 = " ##     ##  ##  ##  ##     ##      #   ##   ##    ##  #  ##  #   ##  ##  \r\n";
			String txt7 = "####     ####    ####     ####    ### #### ####  ###### ######  ######   \r\n";
			TextAnimator.run(txt1, 5);
			TextAnimator.run(txt2, 5);
			TextAnimator.run(txt3, 5);
			TextAnimator.run(txt5, 5);
			TextAnimator.run(txt5, 5);
			TextAnimator.run(txt6, 5);
			TextAnimator.run(txt7, 5);
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
