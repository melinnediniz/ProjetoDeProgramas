package pp.ap1;

public class Configuration {
	private static Integer boardSize = 12;
	public static Integer GRID_COLUMN_SIZE = boardSize;
	public static Integer GRID_ROW_SIZE = boardSize;
	public static Integer PLAYER_MAX_LIFE = 1;
	public static Integer ENEMY_MAX_LIFE = 100;
	
	public static void setBoard(Integer boardSize)
	{
		Configuration.boardSize = boardSize;
	}
}