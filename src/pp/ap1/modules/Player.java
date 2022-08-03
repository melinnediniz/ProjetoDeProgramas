package pp.ap1.modules;

import pp.ap1.Configuration;

public class Player {
	private Integer life;
	private Integer positionX;
	private Integer positionY;
	private Integer rows; 
	private Integer columns;
	
	public Player(Integer rows, Integer columns)
	{
		this.rows = rows - 3;
		this.columns = columns - 3;
		this.positionX = 1 + (int) (Math.random() * this.rows);
		this.positionY = 1 + (int) (Math.random() * this.columns);
		this.life = 3;
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
	
	public void setLife(Integer life) {
		this.life -= life;
	}
	
	public void moveUp(Integer yValue) {
		if(this.positionY < 2)
		{
			return;
		}
			System.out.println("Turning up!\n");
			this.positionY -= yValue;
	}
	
	
	public void moveDown(Integer yValue)
	{
		if(this.positionY > this.rows)
		{
			return;
		}
			this.positionY += yValue;
	}
	
	public void moveLeft(Integer xValue)
	{
		if(positionX < 2)
		{
			return;
		}
			System.out.println("Turning left!\n");
			this.positionX -= xValue;
	}
	
	public void moveRight(Integer xValue)
	{
		if(positionX > this.columns)
		{
			return;
		}
			System.out.println("Turning right!\n");
			this.positionX += xValue;
	}
	
	public void randomizePosition()
	{
		this.positionX = 1 + (int) (Math.random() * rows);
		this.positionY = 1 + (int) (Math.random() * columns);
	}
	
	
	}

	
	

