package pp.ap1.modules.ui;

import java.util.Scanner;

import pp.ap1.modules.ui.utils.TextAnimator;

public class HelpScreen implements IScreen {

	private String title;
	
	public HelpScreen(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	private void input() {
		System.out.println("Press any key to return to menu...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
		
	
	private void draw() throws InterruptedException {
		String message = "EM ADVENTURE WARS O SEU OBJETIVO É PERSEGUIR E DESTRUIR OS BARCOS INIMIGOS"
				+ "\n"
				+"           ___"
				+"     |     | |"
				+"    // \\   | |"
				+"   |--o|===|-|"
				+"   |---|   |P|"
				+"  /     \\ |L|"
				+" |       | |A|"
				+" | U     |=|Y|"
				+" | E     | |E|"
				+" | A     | |R|"
				+" |_______| |_|"
				+"  |@| |@|  | |"
				+"___________|_|_"
				+ "Inimigo: O inimigo (enemy) é representado por {} e se move de forma aleatória a cada 4 movimentos do jogador"
				+ "\n\n"
				+ "Jogador(Você): O player é representado por {} e pode se mover¹ e atirar² no inimigo. "
				+ "\n"
				+ "Jogo desenvolvido para estudo e aplicação dos conhecimentos aprendidos na matéria de "
				+ "\n"
				+ "Projeto de Programas.\n";	
		System.out.println("=================================================");
		TextAnimator.run(message, 1);
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
