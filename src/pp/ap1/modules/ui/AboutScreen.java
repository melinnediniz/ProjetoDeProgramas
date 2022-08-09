package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.modules.ui.utils.TextAnimator;

public class AboutScreen implements IScreen {

	private String title;
	
	public AboutScreen(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	private void input() {
		System.out.println("Press any key to return to menu...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	
	private void draw() throws InterruptedException {
		String message = "		CRÉDITOS"
				+ "\n"
				+ "\n"
				+ "Jogo Criado por: Gabriel Lima e Melinne Diniz"
				+ "\n"
				+ "Jogo desenvolvido para estudo e aplicação dos conhecimentos aprendidos na matéria de "
				+ "\n"
				+ "Projeto de Programas.\n";	
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
