package pp.ap1.modules;

public class Player{
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	private Integer life;
	private Integer maxLife;
	
	public Player(Integer rows, Integer columns, Integer maxLife)
	{
		this.rows = rows - 3;
		this.columns = columns - 3;
		this.maxLife = maxLife;
		this.life = maxLife;
		this.randomizePosition();
	}
	
	public Integer getLife() {
		return life;
	}
	
	public Integer getPositionX() {
		return positionX;
	}
	
	public Integer getPositionY()
	{
		return positionY;
	}

	public Integer getMaxLife() {
		return maxLife;
	}
	
	public void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}
	
	public void setLife(Integer life) {
		this.life = life;
	}
	
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}
	
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}
	
	public void moveUp(Integer yValue) {
		if(this.positionX < 2)
		{
			return;
		}
		System.out.println("Turning up!\n");
		this.positionX -= yValue;
	}
	
	
	public void moveDown(Integer yValue)
	{
		if(this.positionX > this.rows)
		{
			return;
		}
		System.out.println("Turning down!\n");
		this.positionX += yValue;
	}
	
	public void moveLeft(Integer xValue){
		if(positionY < 2)
		{
			return;
		}
		System.out.println("Turning left!\n");
		this.positionY -= xValue;
	}
	
	public void moveRight(Integer xValue){
		if(positionY > this.columns){
			return;
		}
		System.out.println("Turning right!\n");
		this.positionY += xValue;
	}
	
	public void randomizePosition(){
		this.positionX = 1 + (int) (Math.random() * rows);
		this.positionY = 1 + (int) (Math.random() * columns);
		this.positionX = 5;
		this.positionY = 5;
	}

	public void decrementLife() {
		setLife(life - 1);
	}
	
	public void applyCollisionWith(Enemy enemy) {
		Boolean xIsColliding = enemy.getPositionX() == this.getPositionX();
		Boolean yIsColliding = enemy.getPositionY() == this.getPositionY();
		if(xIsColliding && yIsColliding) {
			System.out.println("Player got hit!");
			decrementLife();
		}	
	}
	
	public void draw(Grid grid) {
		String[][] board = grid.getBoard().clone();
		board[this.getPositionX()][this.getPositionY()] = "♥";
		grid.setBoard(board);
	}	
}