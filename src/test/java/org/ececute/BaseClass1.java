package org.ececute;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	public static Actions action;
	public static Alert alert;

	public void getDriver(String browserType) {

		switch (browserType) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("In valid browser");
			break;
		}

	}

	public  void WindowsMax() {
		driver.manage().window().maximize();

	}

	public  void getUrl(String url) {

		driver.get(url);

	}

	public  void sendKey(WebElement element, String readExcel) {
		element.sendKeys(readExcel);
	}

	public  String readExcel(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\javaprojects\\v2\\Adactin3projects\\AdatinSingleton\\src\\test\\resources\\Divyadharshi.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook bookv1 = new XSSFWorkbook(fileInputStream);
		Sheet sheet = bookv1.getSheet("logindata");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
				value = simpleDateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(l);
				value = valueOf.toPlainString();
			}
			break;
		default:
			System.out.println("in valid cell type");
			break;
		}

		return value;
	}

	public  void sleep1(int millis) throws InterruptedException {
		Thread.sleep(millis);

	}

	public  void screenCapture() throws IOException {
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File ScreenshotAs = takesScreenShot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("image/" + System.currentTimeMillis() + ".jpeg");
		FileUtils.copyFile(ScreenshotAs, targetFile);

	}

	public  void sleep(int mills) throws InterruptedException {
		Thread.sleep(mills);
	}

	// public void selectByValue(WebElement location, String readExcel) {
	// Select select = new Select(location);
	// select.selectByValue(readExcel);
	//
	// }
	public  void selectByVisibleText(WebElement element, String readExcel) {
		Select select = new Select(element);
		select.selectByVisibleText(readExcel);
	}

	public   void confirmAlert(String values) {
		Alert a = driver.switchTo().alert();
		switch (values) {
		case "accept":
			a.accept();
			break;
		case "dismiss":
			a.dismiss();
			break;
		default:
			break;
		}
	}

	public  void clickbutton(WebElement searchbox) {
		searchbox.click();
		System.out.println("work in dev");
		System.out.println("work done dev");
		System.out.println("QA is work");
		System.out.println("QA done work");
		
	}

}
