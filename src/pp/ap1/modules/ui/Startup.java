package pp.ap1.modules.ui;

import pp.ap1.modules.ui.utils.TextAnimator;

public class Startup {
	private void draw() throws InterruptedException {
		String title1 = "    _         _                      _                      __        __                  \r\n";
		String title2 = "   / \\     __| |__   __  ___  _ __  | |_  _   _  _ __   ___ \\ \\      / /  __ _  _ __  ___ \r\n";
		String title3 = "  / _ \\   / _` |\\ \\ / / / _ \\| '_ \\ | __|| | | || '__| / _ \\ \\ \\ /\\ / /  / _` || '__|/ __|\r\n";
		String title4 = " / ___ \\ | (_| | \\ V / |  __/| | | || |_ | |_| || |   |  __/  \\ V  V /  | (_| || |   \\__ \\\r\n";
		String title5 = "/_/   \\_\\ \\__,_|  \\_/   \\___||_| |_| \\__| \\__,_||_|    \\___|   \\_/\\_/    \\__,_||_|   |___/\r\n\n";
		
		TextAnimator.run(title1, 5);
		TextAnimator.run(title2, 5);
		TextAnimator.run(title3, 5);
		TextAnimator.run(title4, 5);
		TextAnimator.run(title5, 5);
	}
	
	public void run() throws InterruptedException {
		this.draw();
	}
}
