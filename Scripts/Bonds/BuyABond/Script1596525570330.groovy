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

'Passing username globally'
WebUI.setText(findTestObject('Login Page/Username'), GlobalVariable.UN)

'Passing password globally'
WebUI.setText(findTestObject('Login Page/Password'), GlobalVariable.PW)

'Click on agree button'
WebUI.click(findTestObject('Login Page/Agree Btn'))

'Verifying text on home'
WebUI.verifyElementText(findTestObject('HomePage/Welcome_Text'), 'Welcome Great American Staff!')

WebUI.click(findTestObject('LeftMenu/Commercial bonds left menu'))

WebUI.click(findTestObject('LeftMenu/Bonds'))

WebUI.click(findTestObject('LeftMenu/BuyABond'))

WebUI.verifyElementText(findTestObject('BuyABond/ChooseAccount/BuyABond Text Validation'), 'Buy a Bond: Choose an Account')

WebUI.click(findTestObject('BuyABond/ChooseAccount/ChooseAnAcc_Continue Btn'))

