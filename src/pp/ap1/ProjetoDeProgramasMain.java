package pp.ap1;

import pp.ap1.modules.ui.AboutScreen;
import pp.ap1.modules.ui.ConfigScreen;
import pp.ap1.modules.ui.GameStartingCounter;
import pp.ap1.modules.ui.HelpScreen;
import pp.ap1.modules.ui.Menu;
import pp.ap1.modules.ui.Startup;

public class ProjetoDeProgramasMain {
	public static void main(String[] args) throws InterruptedException {
		Configuration configuration = new Configuration();
		new Startup().run();
		new Menu()
			.addScreen(new AboutScreen("About"))
			.addScreen(new HelpScreen("Help"))
			.addScreen(new ConfigScreen("Settings", configuration))
		.run();
		new GameStartingCounter().run();
		new Game(configuration).run();
	}


}