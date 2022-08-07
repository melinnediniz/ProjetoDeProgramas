package pp.ap1.modules.ui;

import java.util.Scanner;

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
		String message = "Em AdventureWars, o seu objetivo é destruir todas as vidas da nave inimiga."
				+ "\n"
				+ "Para isso, o jogador poderá atirar misséis durante cada rodada para tentar atigir o inimigo."
				+ "\n\n"
				+ "Jogo Criado por: Gabriel Lima e Melinne Diniz"
				+ "\n"
				+ "Jogo desenvolvido para estudo e aplicação dos conhecimentos aprendidos na matéria de "
				+ "\n"
				+ "Projeto de Programas.\n";	
		System.out.println("=================================================");
		for(int index = 0; index < message.length(); index++) {
			System.out.print(message.charAt(index));
			Thread.sleep(10);
		}
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
