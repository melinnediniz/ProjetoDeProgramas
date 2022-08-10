package pp.ap1;

public class Configuration {
	private Integer boardSize;
	public Integer gridColumnSize;
	public Integer gridRowSize;
	public static Integer PLAYER_MAX_LIFE = 3;
	public static Integer ENEMY_MAX_LIFE = 100;
	
	public Configuration() {
		this.boardSize = 10;
		this.gridColumnSize = getBoardSize();
		this.gridRowSize = getBoardSize();
	}
	
	public Integer getBoardSize() {
		return boardSize;
	}
	
	public Integer getGridColumnSize() {
		return gridColumnSize;
	}
	
	public Integer getGridRowSize() {
		return gridRowSize;
	}
	
	public void setBoardSize(Integer boardSize) {
		this.boardSize = boardSize;
		setGridColumnSize(boardSize);
		setGridRowSize(boardSize);
	}
	
	public void setGridColumnSize(Integer gridColumnSize) {
		this.gridColumnSize = gridColumnSize;
	}
	
	public void setGridRowSize(Integer gridRowSize) {
		this.gridRowSize = gridRowSize;
	}
	
}