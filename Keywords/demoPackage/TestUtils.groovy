package demoPackage

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.apache.commons.io.FileUtils
import com.kms.katalon.core.util.KeywordUtil

public class TestUtils {

	/**
	 * Marque le test sur LambdaTest via JavascriptExecutor (exécuté dans la session browser).
	 * Usage: appeler après l'exécution du test (avant driver.quit()).
	 */
	static void markTestStatusViaJS(WebDriver driver, boolean passed, String remark) {
		if (driver == null) return
			try {
				String status = passed ? "passed" : "failed"
				String jsCommand = String.format("lambda-status=%s", status)
				((JavascriptExecutor) driver).executeScript(jsCommand)
				if (remark) {
					((JavascriptExecutor) driver).executeScript("console.log(arguments[0])", remark)
				}
			} catch (Exception e) {
				KeywordUtil.logWarning("Impossible de marquer le test via JS: " + e.message)
			}
	}

	/**
	 * Capture une capture d'écran en cas d'échec et marque le statut du test.
	 */
	static void tearDown(WebDriver driver, String testName, boolean testPassed) {
		try {
			markTestStatusViaJS(driver, testPassed, "Test " + testName + " " + (testPassed ? "passed" : "failed"))
		} catch (Exception e) {
			KeywordUtil.logWarning("Erreur lors du teardown: " + e.message)
		} finally {
			if (driver != null) {
				KeywordUtil.logInfo("Closing WebDriver...")
				driver.quit()
			}
		}
	}
}