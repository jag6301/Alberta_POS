package listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentaaa {
	

			static ExtentReports extent;
			public static ExtentReports extentReportsgenerator()
			{
				String path = System.getProperty("user.dir")+"//reports//AlbertaPayment.html";
				
				ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
				
				reporter.config().setTheme(Theme.DARK);
				
				reporter.config().setReportName("Alberta Report");
				
				extent = new ExtentReports();
				
				extent.attachReporter(reporter);
				
				extent.setSystemInfo("Project name", "Alberta Web");
				
				extent.setSystemInfo("Environment", "SIT");
				
				extent.setSystemInfo("Executed by", "Jagdeesh Patil");
						
				return extent;
			}
}
