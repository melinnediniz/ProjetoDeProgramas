package pp.ap1.modules;

public class Enemy {
	
	private Integer life;
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	
	public Enemy(Integer rows, Integer columns)
	{
		this.rows = rows - 2;
		this.columns = columns - 2;
		this.randomizePosition();
	}
	
	public Integer getLife() {
		return life;
	}
	
	public Integer getPositionX() {
		return positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}
	
	public void setLife(Integer life) {
		this.life = life;
	}
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
	
	public void randomizePosition() {
		this.positionX = 1 + (int) (Math.random() * this.rows);
		this.positionY = 1 + (int) (Math.random() * this.columns);
	}
	
	public void applyCollisionWith(Player player) {
		Boolean xIsColliding = this.getPositionX() == player.getPositionX();
		Boolean yIsColliding = this.getPositionY() == player.getPositionY();
		if(xIsColliding && yIsColliding) {
			this.randomizePosition();
		}
	}

	public void draw(Grid grid) {
		String[][] board = grid.getBoard().clone();
		board[this.getPositionX()][this.getPositionY()] = "#";
		grid.setBoard(board);
	}
	
}
