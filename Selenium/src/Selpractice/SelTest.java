package Selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String WEB_DRIVER_ID = "webdriver.chrome.driver";
		String WEB_DRIVER_PATH = "C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe";
	    
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		WebDriver driver;
		driver = new ChromeDriver();
	    
		String url;
		url = "http://www.naver.com";
		
		try {
			
			driver.get(url);												// url 접속
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"NM_FAVORITE\"]/div[1]/ul[1]/li[4]/a")).click(); // 지식인 클릭
			Thread.sleep(2000);

			String str = driver.getPageSource();
			
			String raw = str.substring(str.indexOf("<h4 class=\"section_headings_title\">많이 본 Q&amp;A</h4>"));
			String raw2 = raw.substring(0,raw.indexOf("<div class=\"paginate\" id=\"rankingPaging\">"));
			
			SelTest.parser(raw2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	public static void parser(String raw) {
		for (int i = 0; i < 10; i++) {
			
		}
		
	}
}


