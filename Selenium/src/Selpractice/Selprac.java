package Selpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Selprac selTest = new  Selprac();
		      selTest.crawl();
		   }
		   //WebDriver
		   private WebDriver driver;
		   
		   //Properties
		   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
		    public static final String WEB_DRIVER_PATH = "C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe";
		    //Crawling url
		    public String base_url;
		    
		    public Selprac() {
		       super();
		       
		       System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		       
		       driver = new ChromeDriver();
		       base_url = "https://datalab.naver.com/keyword/realtimeList.naver";//adress want to see
		    }
		    
		    public void crawl() {
		       
		       try {
		          driver.get(base_url);
		          Thread.sleep(2000);
		          parser(driver.getPageSource());
		          driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[1]/a")).click();
		          //Thread.sleep(2000);
		          //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]")).getClass();
		          Thread.sleep(2000);
		          parser(driver.getPageSource());
		          driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a")).click();
		          Thread.sleep(2000);
		          parser(driver.getPageSource());
		          
		          driver.getPageSource();
		         
		       } catch (Exception e) {
		          e.printStackTrace();
		       } finally {
		          //driver.close();
		       } 
		    }
		    
		    public static void parser(String rawData) {
		    	String result = rawData;
		    	result = result.substring(result.indexOf("<div class=\"list_group\">"));
		    			//임의로 앞엔 자르겠음
		    	result = result.substring(0,result.indexOf("상세옵션 및 대표검색어,유사검색어 ranking"));
		    	System.out.println(result);
		    }
		    
		}