package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	//1
	public static void browserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
   
	//2
	public static void urlWebsite(String url) {
		driver.get(url);
	}

    //3	// click
	public static void click(WebElement clickobject) {
		clickobject.click();
	}

	//4 // sendkeys
	public static void sendTxt(WebElement text, String txt) {
		text.sendKeys(txt);
	}

    //5	// minimize
	public static void browserMinimize() {
		Dimension d = new Dimension(480, 620);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
	}

    //6	// submit
	public static void submitted(WebElement submi) {
		submi.submit();
	}
	
    //7
 	public static void browserMaximize() {
		// Point p = new Point(300,550);
		// Resize the current window to the given dimension
		// driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
	}
   //8
	public static String getAttribute(WebElement att, String text) {
		String storeAtt = att.getAttribute(text);
		System.out.println(storeAtt);
		return storeAtt;
	}

	//9 Actions move to element
	public static void actionsMethod(WebElement move) {
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();
	}

	//10 Actions click
	public static void actionsClick(WebElement actClick) {
		Actions a = new Actions(driver);
		a.click(actClick).perform();
	}
	
		//11 datadriven method
		public static String readExcel(int rownum, int cellnum) throws IOException {
			File f = new File("C:\\Users\\Deepika.LAPTOP-55ACCVSQ\\eclipse-workspace\\Registration\\target\\Excel\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(fis);
			Sheet s = book.getSheet("sheet1");
			Row r = s.getRow(rownum);
			Cell c = r.getCell(cellnum);
			int cellType=c.getCellType();
			// org.apache.poi.ss.usermodel.Cell.getCellType();
			String value = null;
			if (cellType == 1) {
				value = c.getStringCellValue();

			} else if (DateUtil.isCellDateFormatted(c)) {
				java.util.Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
				value = sdf.format(date);

			} else {
				double num = c.getNumericCellValue();
				long l = (long) num;
				value = String.valueOf(l);
			}
			return value;
		}

}
