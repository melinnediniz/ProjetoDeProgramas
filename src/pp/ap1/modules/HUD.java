package pp.ap1.modules;

public class HUD {
	private Integer columns;
	
	public HUD(Integer columns) {
		this.columns = columns;
	}
	
	public Integer getColumns() {
		return columns;
	}

	public void getColumns(Integer columns) {
		this.columns = columns;
	}
	
	public void draw(Player player) {
		String lifeStatus = "░ LIFE: " + player.getLife() + "/" + player.getMaxLife();
		for(int j = 0; j < getColumns(); j++) {
			System.out.print("░");			
		}
		Integer statusLength = getColumns() - lifeStatus.length();
		System.out.print("\n" + lifeStatus);
		for(int j = 0; j < statusLength; j++) {
			if(j == statusLength - 1) {
				System.out.print("░");
			}else {
				System.out.print(" ");				
			}
		}
		System.out.println();
	}
}