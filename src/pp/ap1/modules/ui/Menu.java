package pp.ap1.modules.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{
	private List<IScreen> screens;
	
	public Menu() {
		this.screens = new ArrayList<IScreen>();
	}
	
	public List<IScreen> getScreens() {
		return screens;
	}
	
	public Menu addScreen(IScreen screen){
		getScreens().add(screen);
		return this;
	}
	
	public Integer getTotalSizeScreens() {
		return getScreens().size();
	}
	
	private void input() {
		int totalSizeScreens = getTotalSizeScreens();
		System.out.println("> Type the command[0.." + (totalSizeScreens + 1) + "]: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if(option >= 0 && option <= totalSizeScreens + 1) {
			if(option == 0) return;
			if(option == totalSizeScreens + 1) {
				System.out.println("Bye :D");
				System.exit(0);
			}
			getScreens().get(option - 1).run();
		}else {
			System.out.println("Type a valid command!");
		}
		this.run();
	}
	
	private void draw() {
		System.out.println("================== WELCOME TO ADVENTURE WARS ==================");
		System.out.println("| 0. New game");
		int totalSizeScreens = getTotalSizeScreens();
		for(int index = 0; index < totalSizeScreens; index++) {
			IScreen screen = getScreens().get(index);
			System.out.println("| " + (index + 1) + ". " + screen.getTitle());
		}
		System.out.println("| "+(totalSizeScreens + 1) +". Exit");
	}

	public void run() {
		this.draw();
		this.input();
	}
}
