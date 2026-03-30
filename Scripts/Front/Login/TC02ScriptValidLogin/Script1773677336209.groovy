import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// define Login URL
String loginUrl = 'https://chaker-qa-playpro.playpro.fr/connexion'
// open the browser
WebUI.openBrowser('')
// Maximize the Browser
WebUI.maximizeWindow()
// navigate to Login URL
WebUI.navigateToUrl(loginUrl)
// close cookies
WebUI.click(findTestObject('Object Repository/Cookies/button_Accepter'))
// set email 
WebUI.setText(findTestObject('Object Repository/FO_Login/input__email'), 'chaker-qa-playpro-pro@yopmail.com')
// set password
WebUI.setEncryptedText(findTestObject('Object Repository/FO_Login/input__password'), '/5S6MFFLcE6Z1YMqKBaTSw==')
// click on Login Button
WebUI.click(findTestObject('Object Repository/FO_Login/button_Me connecter'))
// check Header of Page after Login
WebUI.waitForElementPresent(findTestObject('Object Repository/PageObjects/h1_Trouvez o et avec qui jouer instantanment'), 3)
WebUI.verifyElementText(findTestObject('Object Repository/PageObjects/h1_Trouvez o et avec qui jouer instantanment'), 'Trouvez où et avec qui jouer instantanément')
// close the browser
WebUI.closeBrowser()


