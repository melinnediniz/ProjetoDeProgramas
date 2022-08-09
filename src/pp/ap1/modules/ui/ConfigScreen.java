package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.CommandsEnum;
import pp.ap1.Configuration;
import pp.ap1.modules.ui.utils.TextAnimator;

public class ConfigScreen implements IScreen {

	private String title;
	
	public ConfigScreen(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	private void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("> Choose one...");
		String command = scanner.nextLine();
		switch(command) {
			case "1":
				Configuration.setBoard(12);
				System.out.println("12x12!");
				break;
			case "2":
				Configuration.setBoard(16);
				System.out.println("16x16!");
				break;
			case "3":
				Configuration.setBoard(24);
				System.out.println("24x24!");
				break;
			default:
				System.out.println("Type a valid command!");
				break;
		}
		
	}
	
	private void draw() throws InterruptedException {
		String message = "		TAMANHO DO TABULEIRO"
				+ "\n"
				+ "1. Board 12x12 (default)"
				+ "\n"
				+"2. Board 16x16"
				+"\n"
				+"3. Board 24x24"
				+ "\n";	
		System.out.println("=================================================");
		TextAnimator.run(message, 10);
		System.out.println();
	}
	
	public void run() {
		try {
			this.draw();
			this.input();
		} catch (InterruptedException e) {
			System.exit(0);
		}
	}
}
