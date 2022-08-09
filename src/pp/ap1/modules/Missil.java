package pp.ap1.modules;

public class Missil {
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	private Boolean isFired;
	private Player player;
	private Integer fireCount = 0;
	
	public Missil(Integer rows, Integer columns,Player player)
	{
		this.rows = rows - 2;
		this.columns = columns - 2;
		this.isFired = false;
		this.player = player;
		this.keepPosition();

	}
	
	public Boolean getIsFired()
	{
		return this.isFired;
	}

	public void setIsFired(Boolean isFired) {
		this.isFired = isFired;
	}

	public Integer getPositionX() {
		return positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}
	
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
	
	public void setFireCount(Integer fireCount)
	{
		this.fireCount = fireCount;
	}
	
	public Integer getFireCount()
	{
		return fireCount;
	}

	public void keepPosition() {
		if(!isFired)
		{
			this.setPositionX(player.getPositionX());
			this.setPositionY(player.getPositionY());
		}
		
	}
	
	public void Fire(String option)
	{
		if(getFireCount() > 0 || getPositionX() < 2 || getPositionY() < 2 ||
			getPositionX() > this.rows || getPositionY() > this.columns)
		{
			return;
		}
	
		setIsFired(true);
		
		switch(option)
		{
		case "up":
			setPositionX(getPositionX() - 2);
			System.out.println("Firing up!");
			break;
		case "down":
			setPositionX(getPositionX() + 2);
			System.out.println("Firing down!");
			break;
		case "left":
			setPositionY(getPositionY() - 2);
			System.out.println("Firing left!");
			break;
		case "right":
			setPositionY(getPositionY() + 2);
			System.out.println("Firing right!");
			break;				
		}
		
		setFireCount(getFireCount() + 1);
		}
		

	
	public void resetMove() {
		setIsFired(false);
	}
	
	
	public void applyCollisionWith(Enemy enemy) {
		Boolean xIsColliding = this.getPositionX() == enemy.getPositionX();
		Boolean yIsColliding = (this.getPositionY() == enemy.getPositionY());
		//Revisar
		Boolean hasPassedX = xIsColliding && (getPositionY() - 1 == enemy.getPositionY() || getPositionY() + 1 == enemy.getPositionY());
		Boolean hasPassedY = yIsColliding && (getPositionX() - 1 == enemy.getPositionX() || getPositionX() + 1 == enemy.getPositionX());
		if(isFired) {
			if((xIsColliding && yIsColliding) || (hasPassedX || hasPassedY)) {
				enemy.setEnergy(enemy.getEnergy() - 10);
				resetMove();
				setFireCount(0);
				System.out.println("The Enemy has been hit!");
			}
		}
		
	}

	public void draw(Grid grid) {
		String[][] board = grid.getBoard().clone();
		board[this.getPositionX()][this.getPositionY()] = "●"; //☸
		grid.setBoard(board);
		System.out.println(getFireCount());
	}
}