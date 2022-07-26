package utilities;

public class Utils {
	
	

	public static void hardWait(int timeUnit) {
		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
