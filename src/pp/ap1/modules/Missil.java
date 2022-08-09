package pp.ap1.modules;

public class Missil {
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	private Boolean isFired;
	private Player player;
	private Integer fireCount = 0;
	private Integer shotDistance = 2;
	
	public Missil(Integer rows, Integer columns,Player player)
	{
		this.rows = rows - 2;
		this.columns = columns - 2;
		this.isFired = false;
		this.player = player;
		this.keepPosition();

	}
	
	public Integer getShotDistance() {
		return shotDistance;
	}

	public void setShotDistance(Integer shotDistance) {
		this.shotDistance = shotDistance;
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
	
	public void FireUp()
	{
		if(getFireCount() > 0 || getPositionX()- getShotDistance() < 1 )
		{
			return;
		}
		setIsFired(true);
		setPositionX(getPositionX() - getShotDistance());
		System.out.println("Firing up!");
		setFireCount(getFireCount() + 1);
	}
	
	public void FireDown()
	{
		if(getFireCount() > 0 || getPositionY() - getShotDistance()  < 2 )
		{
			return;
		}
		setIsFired(true);
		setPositionX(getPositionX() + getShotDistance());
		System.out.println("Firing down!");
		setFireCount(getFireCount() + 1);
	}
	
	public void FireLeft()
	{
		if(getFireCount() > 0 || getPositionX() + getShotDistance()  > this.rows )
		{
			return;
		}
		setIsFired(true);
		setPositionY(getPositionY() - getShotDistance());
		System.out.println("Firing left!");
		setFireCount(getFireCount() + 1);
	}
	
	public void FireRight()
	{
		if(getFireCount() > 0 || getPositionY() + getShotDistance() > this.columns) {
			return;
		}
		setIsFired(true);
		setPositionY(getPositionY() + getShotDistance());
		System.out.println("Firing right!");
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
		board[this.getPositionX()][this.getPositionY()] = "●|"; //☸
		grid.setBoard(board);
	}
}