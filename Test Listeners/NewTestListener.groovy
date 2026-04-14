import org.openqa.selenium.JavascriptExecutor

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.github.fge.jsonschema.library.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */


	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		KeywordUtil.logInfo("START TEST CASE: " + testCaseContext.getTestCaseId())
		KeywordUtil.logInfo("Variables: " + testCaseContext.getTestCaseVariables())
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		KeywordUtil.logInfo("END TEST CASE: " + testCaseContext.getTestCaseId())
		KeywordUtil.logInfo("STATUS: " + testCaseContext.getTestCaseStatus())
		WebDriver driver = DriverFactory.getWebDriver(false)
        boolean passed = "PASSED".equalsIgnoreCase(testCaseContext.getTestCaseStatus())
        String status = passed ? "passed" : "failed"

        String sessionId = DriverFactory.getWebDriver().getSessionId().toString()
        String username = "chakerlt1"
        String accessKey = "LT_CbXl7y5tdDqGXPrCFWXXcWBzIuJVPrjEeVvZvOmdFTGBs69"

        if (!username || !accessKey) {
            KeywordUtil.logWarning("LambdaTest credentials not provided.")
            return
        }

        String url = "https://api.lambdatest.com/automation/api/v1/sessions/${sessionId}"
        Map<String, Object> body = [
                status: status,
                remark: "Test case ${testCaseContext.getTestCaseId()} completed with status: ${status}"
        ]

        try {
            WS.sendRequest(findTestObject('Object Repository/UpdateLambdaTestStatus', [
                    ('url') : url,
                    ('username') : username,
                    ('accessKey') : accessKey,
                    ('body') : body
            ]))
            KeywordUtil.logInfo("LambdaTest status updated to: ${status}")
        } catch (Exception e) {
            KeywordUtil.logWarning("Failed to update LambdaTest status: ${e.message}")
        } finally {
            try {
                DriverFactory.getWebDriver().quit()
            } catch (Exception ignore) {}
        }
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}
}
