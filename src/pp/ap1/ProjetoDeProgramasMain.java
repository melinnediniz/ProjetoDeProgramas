package pp.ap1;

import pp.ap1.modules.ui.AboutScreen;
import pp.ap1.modules.ui.GameStartingCounter;
import pp.ap1.modules.ui.Menu;

public class ProjetoDeProgramasMain {
	public static void main(String[] args) throws InterruptedException {
		new Menu()
			.addScreen(new AboutScreen("About"))
		.run();
		new GameStartingCounter().run();
		new Game().run();
	}
}