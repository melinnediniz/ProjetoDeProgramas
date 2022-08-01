package pp.ap1.modules;

import pp.ap1.Configuration;

public class Player {
	private Integer life;
	private Integer[] position = new Integer[2];
	private Integer rows = Configuration.GRID_ROW_SIZE -1;
	private Integer columns = Configuration.GRID_COLUMN_SIZE -1;
	
	public Player()
	{
		this.position[0] = 1 + (int) (Math.random() * rows);
		this.position[1] = 1 + (int) (Math.random() * columns);
		this.life = 3;
	}
	
	public Integer getLife() {
		return life;
	}
	public Integer getPositionX() {
		return position[0];
	}
	public Integer getPositionY()
	{
		return position[1];
	}
	
	public void setLife(Integer life) {
		this.life -= life;
	}
	
	public void moveUp(Integer yValue) {
		if(position[0] < rows)
		this.position[0] -= yValue;
	}
	
	
	public void moveDown(Integer yValue)
	{
		if(position[0] < rows)
		this.position[0] += yValue;
	}
	
	public void moveLeft(Integer xValue)
	{
		if(position[1] < columns)
		position[1] -= xValue;
	}
	
	public void moveRight(Integer xValue)
	{
		if(position[1] < columns)
		position[1] += xValue;
	}
	
	public void randomizePosition()
	{
		this.position[0] = 1 + (int) (Math.random() * rows);
		this.position[1] = 1 + (int) (Math.random() * columns);
	}
	
	
	}

	
	

