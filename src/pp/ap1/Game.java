package pp.ap1;
import java.util.Scanner;

import pp.ap1.modules.Enemy;
import pp.ap1.modules.Grid;
import pp.ap1.modules.Player;

public class Game {
	private Grid grid;
	private Player player = new Player();
	private Enemy enemy = new Enemy();
	private Integer shifts = 0;
	
	public Game() {
		this.grid = new Grid(
				Configuration.GRID_ROW_SIZE, 
				Configuration.GRID_COLUMN_SIZE,
				player, 
				enemy
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
		System.out.println("> Type the command (/begin, /up, /down, /left, /right): ");
		String command = scanner.nextLine();
		switch(CommandsEnum.from(command)) {
			case UP:
				System.out.println("Turning up!\n");
				player.moveUp(1);
				break;
			case DOWN:
				System.out.println("Turning down!\n");
				player.moveDown(1);
				break;
			case LEFT:
				System.out.println("Turning left!\n");
				player.moveLeft(1);
				break;
			case RIGHT:
				System.out.println("Turning right!\n");
				player.moveRight(1);
				break;
			case FIRE:
				System.out.println("Firing!");
				break;
			default:
				System.out.println("Type a valid command!");
				break;
		}
		
		shifts++;
		if(shifts > 3)
		{
			System.out.println("The enemy moved!");
			enemy.randomizePosition();
		}
		
		this.run();
	}
	
	private void draw() {
		Grid currentGrid = getGrid();
		currentGrid.draw();
		System.out.println(player);
	
	}
	public void run() {
		this.draw();
		this.input();
	}
}
