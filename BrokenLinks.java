package sample.sample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		String str ="some";
		switch (str) {
		case "Hello":
			break;

		default:
			break;
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			String url = it.next().getAttribute("href");
			try {
				HttpURLConnection conn = (HttpURLConnection) (new URL(url).openConnection());
				conn.setRequestMethod("HEAD");
				conn.connect();
				int respCode = conn.getResponseCode();
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}


	}
}