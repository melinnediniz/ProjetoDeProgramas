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
		String message = "COMO JOGAR ADVENTURE WARS"
				+"\n\n"
				+ "                __/___\r\n"
				+ "          _____/______|\r\n"
				+ "  _______/_____\\_______\\_____\r\n"
				+ "  \\              < < <       |\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
				+ "\n"
				+ "Jogador(Você): O player é representado por ☸ e pode se mover¹ e atirar² no inimigo.\n"
				+"\t ¹Movimentos: cima (w), baixo (s), esquerda (a), direita(d)\n"
				+ "\t ²Ataque: para atirar basta digitar f + a direção que deseja atirar. ex: fw (atira para cima)\n"
				+ "\n\n"
				+ "    __|__ |___| |\\\r\n"
				+ "    |o__| |___| | \\\r\n"
				+ "    |___| |___| |o \\\r\n"
				+ "   _|___| |___| |__o\\\r\n"
				+ "  /...\\_____|___|____\\_/\r\n"
				+ "  \\   o * o * * o o  /\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~"
				+"\n"
				+ "Inimigo: O inimigo é representado por {} e se move de forma aleatória no jogo a cada 4 movimentos do jogador.\n"
				+ "\t Ataque: o player recebe dano a cada vez que o inimigo e ele assumem a mesma posição.\n"
				+ "\t Dano: o inimigo recebe dano quando um missel é atirado diretamente nele ou em um dos quadrados ao seu redor.\n" 
				+"\n\n"
				+ "INFORMAÇÕES ADICIONAIS\n"
				+ "O objetivo do jogo é perseguir o barco inimigo ao longo do mapa e atirar misseis até que toda a energia dele chegue a 0%\n"
				+ "E claro, fazer isso sem que ele tire suas vidas entrando em contato com seu barco.\n"
				+ "\n\n";
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
