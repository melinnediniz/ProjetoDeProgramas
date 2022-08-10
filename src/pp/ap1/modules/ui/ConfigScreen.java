package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.CommandsEnum;
import pp.ap1.Configuration;
import pp.ap1.modules.ui.utils.TextAnimator;

public class ConfigScreen implements IScreen {

	private Configuration config;
	private String title;
	
	
	public ConfigScreen(String title, Configuration config) {
		this.title = title;
		this.config = config;
	}
	
	public Configuration getConfig() {
		return config;
	}
	
	public void setConfig(Configuration config) {
		this.config = config;
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
				getConfig().setBoardSize(10);
				System.out.println("10x10!");
				break;
			case "2":
				getConfig().setBoardSize(15);
				System.out.println("15x15!");
				break;
			case "3":
				getConfig().setBoardSize(20);
				System.out.println("20x20!");
				break;
			default:
				System.out.println("Type a valid command!");
				break;
		}
		
	}
	
	private void draw() throws InterruptedException {
		String message = "		TAMANHO DO TABULEIRO"
				+ "\n"
				+ "1. Board 10x10 (default)"
				+ "\n"
				+"2. Board 15x15"
				+"\n"
				+"3. Board 20x20"
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
