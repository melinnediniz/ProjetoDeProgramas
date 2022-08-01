package pp.ap1;
import java.util.Scanner;

import pp.ap1.modules.Grid;

public class Game {
	private Grid grid;
	
	public Game() {
		this.grid = new Grid(
				Configuration.GRID_ROW_SIZE, 
				Configuration.GRID_COLUMN_SIZE
		);
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	private void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("> Type the command (/up, /down, /left, /right): ");
		String command = scanner.nextLine();
		switch(CommandsEnum.from(command)) {
			case UP:
				System.out.println("Turning up!\n");
				break;
			case DOWN:
				System.out.println("Turning down!\n");
				break;
			case LEFT:
				System.out.println("Turning left!\n");
				break;
			case RIGHT:
				System.out.println("Turning right!\n");
				break;
			case FIRE:
				System.out.println("Firing!");
				break;
			default:
				System.out.println("Type a valid command!");
				break;
		}
		this.run();
	}
	
	private void draw() {
		Grid currentGrid = getGrid();
		currentGrid.draw();
	}
	
	public void run() {
		this.draw();
		this.input();
	}
}
