package pp.ap1.modules;

public class Grid implements IDrawable{
	private Integer rows;
	private Integer columns;
	
	public Grid(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
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

	public void draw() {
		Integer rows = getRows();
		Integer columns = getColumns();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(i == 0 || j == 0 || (j == columns - 1)  || i == rows - 1) {
					System.out.print("=");					
				}else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
	}
}
