package pp.ap1.modules;

public class Enemy {
	
	private Integer energy;
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	
	public Enemy(Integer rows, Integer columns, Integer energy)
	{
		this.rows = rows - 2;
		this.columns = columns - 2;
		this.randomizePosition();
		this.energy = energy;
	}
	
	public Integer getEnergy() {
		return energy;
	}
	
	public Integer getPositionX() {
		return positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}
	
	public void setEnergy(Integer energy) {
		this.energy = energy;
	}
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
	
	public void decrementEnergy()
	{
		setEnergy(getEnergy() - 1);
	}
	
	public void energyStatus()
	{
		if(getEnergy() <= 0)
		{
			System.out.println("Inimigo morto");
		}
	}
	
	public void randomizePosition() {
		this.positionX = 1 + (int) (Math.random() * this.rows);
		this.positionY = 1 + (int) (Math.random() * this.columns);
	}
	
	public void applyCollisionWith(Player player, Missil missil) {
		Boolean xIsColliding = (this.getPositionX() == player.getPositionX()) || (this.getPositionX() == missil.getPositionX());
		Boolean yIsColliding = this.getPositionY() == player.getPositionY()   ||(this.getPositionX() == missil.getPositionX());
		if(xIsColliding && yIsColliding) {
			this.randomizePosition();
		}
	}

	public void draw(Grid grid) {
		String[][] board = grid.getBoard().clone();
		board[this.getPositionX()][this.getPositionY()] = "|⬚|"; //☸
		grid.setBoard(board);
	}
	
}
