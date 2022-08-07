package pp.ap1;
import java.util.Scanner;

import pp.ap1.modules.Enemy;
import pp.ap1.modules.Grid;
import pp.ap1.modules.HUD;
import pp.ap1.modules.Player;

public class Game {
	private final Integer rowSize = Configuration.GRID_ROW_SIZE;
	private final Integer columnSize = Configuration.GRID_COLUMN_SIZE;
	private Grid grid;
	private Player player; 
	private Enemy enemy;
	private HUD hud;
	private Integer shifts;
	
	public Game() {
		this.grid = new Grid(rowSize, columnSize);
		this.player = new Player(rowSize, columnSize, Configuration.PLAYER_MAX_LIFE);
		this.enemy = new Enemy(rowSize, columnSize);
		this.hud = new HUD(columnSize);
		this.shifts = 0;
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	public HUD getHud() {
		return hud;
	}
	
	public Integer getShifts() {
		return shifts;
	}
	
	public void setShifts(Integer shifts) {
		this.shifts = shifts;
	}
	
	public void setHud(HUD hud) {
		this.hud = hud;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
	
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	private void resetShifts() {
		setShifts(0);
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
		setShifts(getShifts() + 1);
		if(getShifts() > 3){
			System.out.println("The enemy moved!");
			enemy.randomizePosition();
			resetShifts();
		}
		if(player.getLife() == 0) {
			System.out.println("Game over man, game over!");
			return;
		}
		this.run();
	}
	
	private void draw() {
		Grid currentGrid = getGrid();
		Player currentPlayer = getPlayer();
		Enemy currentEnemy = getEnemy();
		HUD hud = getHud();
		currentEnemy.applyCollisionWith(currentPlayer);
		currentPlayer.applyCollisionWith(currentEnemy);
		currentGrid.draw(currentPlayer, currentEnemy, hud);
	}
	public void run() {
		this.draw();
		this.input();
	}
}
