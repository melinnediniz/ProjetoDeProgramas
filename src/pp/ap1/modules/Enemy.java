package pp.ap1.modules;

public class Enemy {
	
	private Integer life;
	private Integer[] position = new Integer[2];
	private Integer rows; 
	private Integer columns;
	
	public Enemy(Integer rows, Integer columns)
	{
		this.rows = rows - 2;
		this.columns = columns - 2;
		this.position[0] = 1 + (int) (Math.random() * this.rows);
		this.position[1] = 1 + (int) (Math.random() * this.columns);
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
		this.position[0] = 1 + (int) (Math.random() * this.rows);
		this.position[1] = 1 + (int) (Math.random() * this.columns);
	}

}
