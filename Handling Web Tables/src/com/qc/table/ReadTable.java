package com.qc.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/QueueCodes/Software/Selenium/Offline%20Website/pages/examples/users.html");
		
		WebElement table = driver.findElement(By.className("table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows: "+rows.size());
		
		for(WebElement row: rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			System.out.println("Total column: "+columns.size());
			for(WebElement col: columns ) {
				System.out.println(col.getText());
			}
			System.out.println("----------------------------------");
		}
		driver.close();
	}
}
