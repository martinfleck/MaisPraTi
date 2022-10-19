package util;

public class Delay {
	
	public static void aguarda(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
