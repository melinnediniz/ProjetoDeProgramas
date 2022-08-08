package pp.ap1.modules.ui.utils;

public class TextAnimator {
	public static void run(String text, Integer milliseconds) throws InterruptedException {
		for(int index = 0; index < text.length(); index++) {
			System.out.print(text.charAt(index));
			Thread.sleep(milliseconds);
		}
	}
}
