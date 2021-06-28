package SeleniumSessions;

public class BrowserUtilTest {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		br.initDriver("chrome");
		br.launchurl("https://www.amazon.in/");
		String title=br.getPageTitle();
		System.out.println(title);
		
		if(title.contains("Online Shopping")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
		}	
				
		br.closeBrowser();
	}

}
