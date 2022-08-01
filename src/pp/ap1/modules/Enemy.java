package pp.ap1.modules;

import pp.ap1.Configuration;

public class Enemy {
	
	private Integer life;
	private Integer[] position = new Integer[2];
	private Integer rows = Configuration.GRID_ROW_SIZE -1;
	private Integer columns = Configuration.GRID_COLUMN_SIZE -1;
	
	public Enemy()
	{
		this.position[0] = 1 + (int) (Math.random() * rows);
		this.position[1] = 1 + (int) (Math.random() * columns);
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
		this.life = life;
	}
	
	public void randomizePosition()
	{
		this.position[0] = 1 + (int) (Math.random() * rows);
		this.position[1] = 1 + (int) (Math.random() * columns);
	}

}
