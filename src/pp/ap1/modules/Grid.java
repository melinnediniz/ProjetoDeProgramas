package pp.ap1.modules;

public class Grid{
	private Integer rows;
	private Integer columns;
	private String[][] board;
	
	public Grid(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		this.board = new String[rows][columns];
	}
	
	public Integer getColumns() {
		return columns;
	}
	
	public Integer getRows() {
		return rows;
	}
	
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public String[][] getBoard() {
		return board;
	}
	
	public void setBoard(String[][] board) {
		this.board = board;
	}

	public void setupBoard()
	{
		Integer rows = getRows();
		Integer columns = getColumns();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				Boolean isBoudary = (i == 0) || (j == 0) || (j == columns-1) || (i == rows-1);
				if(isBoudary) {
					this.board[i][j] = "■■";
				}else {
					this.board[i][j] = "_|";
				}
			}	
		}
				
	}
	
	public void draw(Player player, Enemy enemy, Missil missil, HUD hud) {
		setupBoard();

		hud.draw(player, enemy);
		missil.draw(this);
		player.draw(this);
		enemy.draw(this);
		
		for(int i = 0; i < getRows(); i++) {
			for(int j = 0; j < getColumns(); j++) 
			{
				System.out.print(this.board[i][j]);
			}	
			System.out.println();
		}
		
	}
}


