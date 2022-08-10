package pp.ap1;
import java.util.Scanner;

import pp.ap1.modules.Enemy;
import pp.ap1.modules.Grid;
import pp.ap1.modules.HUD;
import pp.ap1.modules.Missil;
import pp.ap1.modules.Player;
import pp.ap1.modules.ui.GameOverScreen;
import pp.ap1.modules.ui.VictoryScreen;

public class Game {
	private final Integer rowSize = Configuration.GRID_ROW_SIZE;
	private final Integer columnSize = Configuration.GRID_COLUMN_SIZE;
	private Grid grid;
	private Player player; 
	private Missil missil;

	private Enemy enemy;
	private HUD hud;
	private Integer shifts;
	
	public Game() {
		this.grid = new Grid(rowSize, columnSize);
		this.player = new Player(rowSize, columnSize, Configuration.PLAYER_MAX_LIFE);
		this.enemy = new Enemy(rowSize, columnSize, Configuration.ENEMY_MAX_LIFE);
		this.missil = new Missil(rowSize, columnSize, this.player);
		this.hud = new HUD(columnSize);
		this.shifts = 0;
	}
	
	public Missil getMissil() {
		return missil;
	}

	public void setMissil(Missil missil) {
		this.missil = missil;
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
		System.out.println("> Type the command (w (up)►, a (left)◄, s (down)▼, d (right)◄, f (fire) or exit (0): ");
		String command = scanner.nextLine();
		switch(CommandsEnum.from(command)) {
			case UP:
				player.moveUp(1);
				missil.resetMove();
				break;
			case DOWN:
				player.moveDown(1);
				missil.resetMove();
				break;
			case LEFT:
				player.moveLeft(1);
				missil.resetMove();
				break;
			case RIGHT:
				player.moveRight(1);
				missil.resetMove();
				break;
			case FIREUP:
				missil.FireUp();
				break;
			case FIREDOWN:
				missil.FireDown();
				break;
			case FIRELEFT:
				missil.FireLeft();
				break;
			case FIRERIGHT:
				missil.FireRight();
				break;
			case EXIT:
				System.exit(0);
			default:
				System.out.println("Type a valid command!");
				break;
		}

		setShifts(getShifts() + 1);
		if(getShifts() > 3){
			System.out.println("The enemy moved!");
			enemy.randomizePosition();
			resetShifts();
			missil.setFireCount(0);
		}
		this.run();
	}
	
	private void draw() {
		Grid currentGrid = getGrid();
		Missil currentMissil = getMissil();
		Player currentPlayer = getPlayer();
		currentMissil.keepPosition();
		Enemy currentEnemy = getEnemy();
		HUD hud = getHud();
		currentMissil.applyCollisionWith(currentEnemy);
		//currentEnemy.applyCollisionWith(currentMissil);
		currentPlayer.applyCollisionWith(currentEnemy);
		currentGrid.draw(currentPlayer, currentEnemy, currentMissil, hud);
	}
	public void run() {
		this.draw();
		if(getPlayer().getLife() == 0) {
			new GameOverScreen().run();
			return;
		}
		
		if(getEnemy().getEnergy() <= 0)
		{
			new VictoryScreen().run();
		}
		this.input();
	}
}
