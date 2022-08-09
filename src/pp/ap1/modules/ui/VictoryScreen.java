package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.modules.ui.utils.TextAnimator;

public class VictoryScreen {
	private void input() {
		System.out.println("Press any key to return to finish...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	
	private void draw() {
		try {
			
			
			
			 String txt1 = "__    __  _______  __   __     _     _  _______  __    _  \r\n";
			 String txt2 = "|  | |  ||       ||  | |  |   | | _ | ||       ||  |  | | \r\n";
			 String txt3 = "|  |_|  ||   _   ||  | |  |   | || || ||   _   ||   |_| | \r\n";
			 String txt4 = "|       ||  | |  ||  |_|  |   |       ||  | |  ||       | \r\n";
			 String txt5 = "|_     _||  |_|  ||       |   |       ||  |_|  ||  _    | \r\n";
			 String txt6 = "  |   |  |       ||       |   |   _   ||       || | |   | \r\n";
			 String txt7 = "  |___|  |_______||_______|   |__| |__||_______||_|  |__| \r\n";
			 
			 TextAnimator.run(txt1, 5);
			 TextAnimator.run(txt2, 5);
			 TextAnimator.run(txt3, 5);
			 TextAnimator.run(txt4, 5);
			 TextAnimator.run(txt5, 5);
			 TextAnimator.run(txt6, 5);
			 TextAnimator.run(txt7, 5);
			 
		} catch (InterruptedException e) {
			System.exit(0);
		}
	}
	
	public void run(){
		this.draw();
		this.input();
	}
}