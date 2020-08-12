import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

'Passing URL globally'
WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Passing username globally'
WebUI.setText(findTestObject('UI Test Objects/Pages/Login Page/textUsername'), GlobalVariable.UN)

'Passing password globally'
WebUI.setText(findTestObject('UI Test Objects/Pages/Login Page/textPassword'), GlobalVariable.PW)

'Click on agree button'
WebUI.click(findTestObject('UI Test Objects/Pages/Login Page/btnAgree'))

WebUI.delay(5)

'Verifying text on home'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Home Page/labelWelcome'), 'Welcome Great American Staff!')

'Click on commercial bonds on left menu'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkCommercialbonds'))

'Click on bonds on left menu'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkBonds'))

'click on find a bond on left menu'
WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkFindABond'))

WebUI.delay(5)

'Verifying drop down is having default value'
WebUI.selectOptionByLabel(findTestObject('UI Test Objects/Pages/Find A Bond Page/listBondNo'), 'Bond Number', false)

'Giving bond number'
WebUI.setText(findTestObject('UI Test Objects/Pages/Find A Bond Page/textBondNumber'), '1697178')

'Click on submit button'
WebUI.click(findTestObject('UI Test Objects/Pages/Find A Bond Page/btnSubmit'))

'Accepting alert to view the bond'
WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('e-SURETY ... Surety Bonds Online')

WebUI.scrollToElement(findTestObject('UI Test Objects/Pages/View Bond Page/labelClaimStatus'), 3)

def status = CustomKeywords.'bonds.MySurety.BondInfo'('Claims:')

println(status)

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(status, 'Yes', false)

WebUI.click(findTestObject('UI Test Objects/Pages/View Bond Page/btnExitBond'))

'Verifying text on home'
WebUI.verifyElementText(findTestObject('UI Test Objects/Pages/Home Page/labelWelcome'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('UI Test Objects/Pages/Left Panel/linkLogout'))

WebUI.delay(3)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

