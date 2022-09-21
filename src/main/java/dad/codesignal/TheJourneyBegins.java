package dad.codesignal;

public class TheJourneyBegins {

	public int add(int a, int b) {
		return a + b;
	}

	public int centuryFromYear(int year) {
		if (1 <= year && year <= 2005) {
			if ((year % 100) == 0) {
				year = year / 100;
			} else {
				year = year / 100;
				year = year + 1;
			}
		}
		return year;
	}
	
	
	

}
