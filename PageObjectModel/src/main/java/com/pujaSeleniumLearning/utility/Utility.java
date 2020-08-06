package com.pujaSeleniumLearning.utility;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility
{

	public static String getScreenshot(WebDriver driver, String screenShotName) throws Exception
	{
		try
		{
			TakesScreenshot tS = (TakesScreenshot) driver;
			File src = tS.getScreenshotAs(OutputType.FILE);
			String projectDirectory = System.getProperty("user.dir");
			String destination = projectDirectory + "\\Reports\\Screenshots\\"
					+ new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			// String destination =
			// "C:\\Users\\PUJA\\eclipse-workspace\\SeleniumLearning\\Screenshots\\";
			FileUtils.copyFile(src, new File(destination + screenShotName + ".png"));
			return destination;
		} catch (Exception e)
		{
			System.out.println("There is some error capturing the screenshot" + e.getMessage());
		}
		return screenShotName;
	}

	public static String captureScreenshotforReport(WebDriver driver, String screenshotName)
	{
		int i = 0;
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String path = "./Reports/Screenshots/" + new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date())
				+ screenshotName + (++i) + ".png";

		File destination = new File(path);

		try
		{
			Thread.sleep(1000);
			FileUtils.copyFile(source, destination);
		} catch (Exception e)
		{
			System.out.println("There is some error capturing the screenshot" + e.getMessage());
		}

		return path;
	}

	public static String takeDesktopScreenshot(WebDriver driver, String screenshotName) throws Exception
	{
		int i = 0;

		Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

		BufferedImage screenshot = new Robot().createScreenCapture(rect);

		Image cursor = ImageIO.read(new File("./cursor1.png"));
		int x = MouseInfo.getPointerInfo().getLocation().x;
		int y = MouseInfo.getPointerInfo().getLocation().y;

		Graphics2D graphics2d = screenshot.createGraphics();
		graphics2d.drawImage(cursor, x, y, 15, 23, null);
		String path = "./Reports/Screenshots/" + new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date())
				+ screenshotName + (++i) + ".png";
		ImageIO.write(screenshot, "PNG", new File(path));

		return path;
	}

}
