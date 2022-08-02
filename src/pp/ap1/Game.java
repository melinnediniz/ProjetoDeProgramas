package pp.ap1;
import java.util.Scanner;

import pp.ap1.modules.Enemy;
import pp.ap1.modules.Grid;
import pp.ap1.modules.Player;

public class Game {
	private Grid grid;
	private Integer rowSize = Configuration.GRID_ROW_SIZE;
	private Integer columnSize = Configuration.GRID_COLUMN_SIZE;
	private Player player = new Player(rowSize, columnSize);
	private Enemy enemy = new Enemy(rowSize, columnSize);
	private Integer shifts = 0;
	
	public Game() {
		this.grid = new Grid(
				rowSize, 
				columnSize,
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
		System.out.println("> Type the command (/up, /down, /left, /right): ");
		String command = scanner.nextLine();
		switch(CommandsEnum.from(command)) {
			case UP:
				player.moveUp(1);
				break;
			case DOWN:
				player.moveDown(1);
				break;
			case LEFT:
				player.moveLeft(1);
				break;
			case RIGHT:
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
